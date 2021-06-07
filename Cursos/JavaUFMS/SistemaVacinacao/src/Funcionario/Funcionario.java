package Funcionario;

import Endereco.Endereco;
import Pessoa.Pessoa;

public class Funcionario extends Pessoa{
	private int codMatricula = 0;

	public Funcionario() {
		super();
	}
	public Funcionario(String nome, Integer idade, char sexo, String cpf, String celular, Endereco endereco,
			String profissao, boolean comorbidade, String raca, boolean gestante, int codMatricula) {
		super(nome, idade, sexo, cpf, celular, endereco, profissao, comorbidade, raca, gestante);
		this.codMatricula = codMatricula;
	}
	public int getCodMatricula() {
		return codMatricula;
	}
	public void setCodMatricula(int codMatricula) {
		this.codMatricula = codMatricula;
	}

	@Override
	public String toString() {
		return "\nFuncionario:" +
				"\nMatricula: " + codMatricula + 
				"\nNome:" + getNome() + 
				"\nProfissao: "+ getProfissao();
	}
}
