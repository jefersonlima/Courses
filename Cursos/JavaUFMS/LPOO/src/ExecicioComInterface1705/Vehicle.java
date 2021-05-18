package ExecicioComInterface1705;

public abstract class Vehicle {
	private String nome;
	public Vehicle(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void drive();

}
