package Pessoa;

import Endereco.Endereco;
import Interfaces.Verificavel;


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
	
	public Pessoa(String nome, Integer idade, char sexo, String cpf, String celular, int prioridade, Endereco endereco,
			String profissao, boolean comorbidade, String raca, boolean gestante) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
		this.celular = celular;
		this.prioridade = prioridade;
		this.endereco = endereco;
		this.profissao = profissao;
		this.comorbidade = comorbidade;
		this.raca = raca;
		this.gestante = gestante;
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
	public boolean validarCPF(String codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void solicitarNovo() {
		// TODO Auto-generated method stub
		
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
