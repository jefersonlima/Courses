package ExecicioComInterface1705;

public class Refrigerator extends Truck implements Imprimir {
	
	public Refrigerator(String nome, String cor, String marca, Double velocidade, int quantidadeRodas,
			String tipoCombustivel, int capacidadePassageiros, double capacidadeTanqueCombustivel, double pesoMaximo) {
		super(nome, cor, marca, velocidade, quantidadeRodas, tipoCombustivel, capacidadePassageiros,
				capacidadeTanqueCombustivel, pesoMaximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.println(
				"\n*DADOS DO CAMINH�O REFRIGERADOR*" +
				"\nNome: " + getNome() +
				"\nCor do Caminh�o: " + getCor() +
				"\nMarca: " + getMarca() +
				"\nVelocidade Max: " + getVelocidade() + "k/h" +
				"\nQuantidade de rodas: " + getQuantidadeRodas() +
				"\ntipo de Combustivel: " + getTipoCombustivel() +
				"\nCapacidade M�xima de Passageiros: " + getCapacidadePassageiros() +
				"\nTara do Caminh�o: "
				);
	}
}
