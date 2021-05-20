package ExecicioComInterface1705;

public class Bike extends Vehicle implements Load, Imprimir{
	private String tipoBike;
	private double pesoMaximo;
	
	public Bike(String nome, String cor, String marca, Double velocidade, int quantidadeRodas, String tipoBike, double pesoMaximo) {
		super(nome, cor, marca, velocidade, quantidadeRodas);
		this.tipoBike = tipoBike;
		this.pesoMaximo = pesoMaximo;
	}
	public String getTipoBike() {
		return tipoBike;
	}
	public void setTipoBike(String tipoBike) {
		this.tipoBike = tipoBike;
	}
	public double getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	@Override
	public void drive() {
		System.out.println("Estou Andando de " + getNome());	
	}
	@Override
	public void maxWeight() {
		System.out.println("Capacidade Máxima de Peso: " + getPesoMaximo());	
	}
	@Override
	public void imprimir() {
		System.out.println(
				"\n*DADOS DA BIKE*" +
				"\nNome: " + getNome() +
				"\nCor da Bike: " + getCor() +
				"\nMarca: " + getMarca() +
				"\nVelocidade Max: " + getVelocidade() + "k/h" +
				"\nQuantidade de rodas: " + getQuantidadeRodas() +
				"\nTipo de Bike: " + getTipoBike() +
				"\nCapacidade Máxima de Peso: " + getPesoMaximo() + "kg\n"
				);	
	}
}
