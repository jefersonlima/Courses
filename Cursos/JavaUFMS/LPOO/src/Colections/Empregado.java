package Colections;

public class Empregado implements Comparable {
	
	private int id;
	private String nome;
	
	public Empregado(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(Object obj) {
		return this.id-((Empregado) obj).getId();
	}
	
	public String toString() {
		return "id: "+id+" Nome: "+nome;
	}

}
