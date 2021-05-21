package ExecicioComInterface1705;

public class Car extends AutoMotor implements Imprimir {

	public Car(String nome, String cor, String marca, Double velocidade, int quantidadeRodas, String tipoCombustivel,
			int capacidadePassageiros, double capacidadeTanqueCombustivel) {
		super(nome, cor, marca, velocidade, quantidadeRodas, tipoCombustivel, capacidadePassageiros,
				capacidadeTanqueCombustivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.println(
				"\n*DADOS DO CARRO*" +
				"\nNome: " + getNome() +
				"\nCor do carro: " + getCor() +
				"\nMarca: " + getMarca() +
				"\nVelocidade Max: " + getVelocidade() + "k/h" +
				"\nQuantidade de rodas: " + getQuantidadeRodas() +
				"\ntipo de Combustivel: " + getTipoCombustivel() +
				"\nCapacidade Máxima de Passageiros: " + getCapacidadePassageiros() 
				);	
		
	}


}
