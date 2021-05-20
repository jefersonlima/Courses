package ExecicioComInterface1705;

public abstract class Vehicle {
	private String nome;
	private String cor;
	private String marca;
	private Double velocidade;
	private int quantidadeRodas;
	
	public Vehicle(String nome, String cor, String marca, Double velocidade, int quantidadeRodas) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.marca = marca;
		this.velocidade = velocidade;
		this.quantidadeRodas = quantidadeRodas;
	}
	
	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void drive();

}
