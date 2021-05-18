package ExemplosAula;

public class Aluno {
	
	/*Atributos*/
	String nome;
	int idade;
	String curso;
	String rga;
	String cpf;
	
	/*Construtores*/
	public Aluno() {
		super();
	}

	public Aluno(String nome, int idade, String curso, String rga, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.rga = rga;
		this.cpf = cpf;
	}
	
	/*Getters and Setters*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getRga() {
		return rga;
	}

	public void setRga(String rga) {
		this.rga = rga;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/*Metodos*/
	public void imprimir() {
		System.out.println(
				"\nNome: " + this.nome +
				"\nIdade: " + this.idade +
				"\nCurso: " + this.curso +
				"\nRGA: " + this.rga +
				"\nCPF: " + this.cpf
				);
	}

}
