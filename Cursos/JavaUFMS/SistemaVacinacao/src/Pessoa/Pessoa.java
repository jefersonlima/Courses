package Pessoa;

import Endereco.Endereco;
import java.util.InputMismatchException;
import Interfaces.Verificavel;
import Prioridade.Prioridade;


public class Pessoa implements Verificavel{
	private String nome; 
	private Integer idade;
	private char sexo;
	private String cpf; 
	private String celular; 
	private int prioridade;
	private Endereco endereco; 
	private String profissao; 
	private boolean comorbidade; 
	private String raca; 
	private boolean gestante;
	
	public Pessoa(String nome, Integer idade, char sexo, String cpf, String celular, Endereco endereco,
			String profissao, boolean comorbidade, String raca, boolean gestante) {
		super();
		Prioridade prioridade = new Prioridade();
		if (validarCPF(cpf) == true){
			this.cpf = cpf;
			this.nome = nome;
			this.idade = idade;
			this.sexo = sexo;			
			this.celular = celular;
			this.endereco = endereco;
			this.profissao = profissao;
			this.comorbidade = comorbidade;
			this.raca = raca;
			if (sexo == 'M') {
				this.gestante = false;
			}else {
				this.gestante = gestante;
			}
			this.prioridade = prioridade.verificaPrioridade(idade,profissao,comorbidade,raca,gestante);
		} else {
			solicitarNovo(nome, idade, sexo, cpf, celular, endereco,
					profissao, comorbidade, raca, gestante);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public boolean isComorbidade() {
		return comorbidade;
	}

	public void setComorbidade(boolean comorbidade) {
		this.comorbidade = comorbidade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isGestante() {
		return gestante;
	}

	public void setGestante(boolean gestante) {
		this.gestante = gestante;
	}

	@Override
	public boolean validarCPF(String CPF) {
		//https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
        } catch (InputMismatchException erro) {
                return(false);
        }   
	}

	@Override
	public void solicitarNovo() {
		// TODO Auto-generated method stub
		
	}
	
	public void solicitarNovo(String nome, Integer idade, char sexo, String cpf, String celular, Endereco endereco, String profissao, boolean comorbidade, String raca, boolean gestante) {
		System.out.println("CPF: " + cpf + " Invalido!\n Digite Novamente");
		String novoCpf = "00409163163";
		Pessoa pessoa = new Pessoa(nome, idade, sexo, novoCpf, celular, endereco, profissao, comorbidade, raca, gestante);
	}

	@Override
	public String toString() {
		return "Pessoa: " + 
				"\nNome: " + nome + 
				"\nidade: " + idade + 
				"\nsexo: " + sexo + 
				"\ncpf: " + cpf + 
				"\ncelular: " + celular+ 
				"\nprioridade: " + prioridade + 
				"\nendereco: " + endereco + 
				"\nprofissao: " + profissao + 
				"\ncomorbidade: " + comorbidade + 
				"\nraca: " + raca + 
				"\ngestante: " + gestante;
	}
}
