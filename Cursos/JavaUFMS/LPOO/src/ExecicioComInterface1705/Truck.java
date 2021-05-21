package ExecicioComInterface1705;

public class Truck extends AutoMotor implements Load, Imprimir {
	
	private double pesoMaximo;
	
	public Truck(String nome, String cor, String marca, Double velocidade, int quantidadeRodas, String tipoCombustivel,
			int capacidadePassageiros, double capacidadeTanqueCombustivel, double pesoMaximo) {
		super(nome, cor, marca, velocidade, quantidadeRodas, tipoCombustivel, capacidadePassageiros,
				capacidadeTanqueCombustivel);
		this.pesoMaximo = pesoMaximo;
	}

	public Double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	@Override
	public void imprimir() {
		System.out.println(
				"\n*DADOS DO CAMINHÃO*" +
				"\nNome: " + getNome() +
				"\nCor do Caminhão: " + getCor() +
				"\nMarca: " + getMarca() +
				"\nVelocidade Max: " + getVelocidade() + "k/h" +
				"\nQuantidade de rodas: " + getQuantidadeRodas() +
				"\ntipo de Combustivel: " + getTipoCombustivel() +
				"\nCapacidade Máxima de Passageiros: " + getCapacidadePassageiros() +
				"\nTara do Caminhão: " + getPesoMaximo()
				);	
	}

	@Override
	public void maxWeight() {
		getPesoMaximo();
		
	}
}
