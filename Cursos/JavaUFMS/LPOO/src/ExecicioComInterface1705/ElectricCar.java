package ExecicioComInterface1705;

public final class ElectricCar extends AutoMotorElectric implements Imprimir {

	public ElectricCar(String nome, String cor, String marca, Double velocidade, int quantidadeRodas,
			int capacidadePassageiros, double capacidadeCargaBateria) {
		super(nome, cor, marca, velocidade, quantidadeRodas, capacidadePassageiros, capacidadeCargaBateria);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.println(
				"\n*DADOS DO CARRO EL�TRICO*" +
				"\nNome: " + getNome() +
				"\nCor do �nibus: " + getCor() +
				"\nMarca: " + getMarca() +
				"\nVelocidade Max: " + getVelocidade() + "k/h" +
				"\nQuantidade de rodas: " + getQuantidadeRodas() +
				"\nCapacidade M�xima de Passageiros: " + getCapacidadePassageiros() 
				);
		
	}


}
