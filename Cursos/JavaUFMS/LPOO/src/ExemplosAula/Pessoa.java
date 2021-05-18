package ExemplosAula;

public class Pessoa {
	String nome;
	int idade;
	
	public Pessoa() {
		nome = "Fulano";
		idade = 0;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
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
	
	public void imprimir() {
		System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\n");
	}
}
