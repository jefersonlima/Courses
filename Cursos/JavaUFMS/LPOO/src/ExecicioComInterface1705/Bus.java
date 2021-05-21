package ExecicioComInterface1705;

public class Bus extends AutoMotor implements Imprimir {
	public Bus(String nome, String cor, String marca, Double velocidade, int quantidadeRodas, String tipoCombustivel,
			int capacidadePassageiros, double capacidadeTanqueCombustivel) {
		super(nome, cor, marca, velocidade, quantidadeRodas, tipoCombustivel, capacidadePassageiros,
				capacidadeTanqueCombustivel);
		// TODO Auto-generated constructor stub
	}

	public void pegaPassageiro() {
		System.out.println("Pegando Passageiro!!");
		if(isLigado() == false) {
			System.out.println("� preciso ligar o �nibus e digirir-se at� um ponto primeiro.");
		}else {
			if((getQuantidadePassageiros() + 1) >= getCapacidadePassageiros()) {
				System.out.println("�nibus Lotado!!");
			}else {
				setQuantidadePassageiros(getQuantidadePassageiros() + 1);
				numberOfPassengers();
			}
		}
	}
	public void deixaPassageiro() {
		System.out.println("Deixando Passageiro!!");
		if(getQuantidadePassageiros() == 0) {
			System.out.println("N�o h� passageiros!!");
		}else {
			setQuantidadePassageiros(getQuantidadePassageiros() - 1);
			numberOfPassengers();
		}
	}
	@Override
 	public void imprimir() {
		System.out.println(
				"\n*DADOS DO �NIBUS*" +
				"\nNome: " + getNome() +
				"\nCor do �nibus: " + getCor() +
				"\nMarca: " + getMarca() +
				"\nVelocidade Max: " + getVelocidade() + "k/h" +
				"\nQuantidade de rodas: " + getQuantidadeRodas() +
				"\ntipo de Combustivel: " + getTipoCombustivel() +
				"\nCapacidade M�xima de Passageiros: " + getCapacidadePassageiros() 
				);	
	}
}
