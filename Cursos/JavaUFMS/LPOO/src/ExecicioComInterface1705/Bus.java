package ExecicioComInterface1705;

public class Bus extends Vehicle implements Fuel, Load, Passengers, Imprimir {
	private boolean ligado;
	private int capacidadePassageiros;
	private int quantidadePassageiros;
	private double capacidadeTanqueCombustivel;
	private double quantidadeCombustivel;
	private String tipoCombustivel;
	
	public Bus(String nome, String cor, String marca, Double velocidade, int quantidadeRodas, String tipoCombustivel, int capacidadePassageiros, double capacidadeTanqueCombustivel) {
		super(nome, cor, marca, velocidade, quantidadeRodas);
		this.tipoCombustivel = tipoCombustivel;
		this.ligado = false;
		this.quantidadePassageiros = 0;
		this.quantidadeCombustivel = 5;
		this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
		this.capacidadePassageiros = capacidadePassageiros;
		
	}	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}
	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}
	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}
	public double getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}
	public void setCapacidadeTanqueCombustivel(double capacidadeTanqueCombustivel) {
		this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
	}
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void setQuantidadeCombustivel(double quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	@Override
	public void start() {
		if (isLigado() == false) {
			System.out.println("Ligando �nibus!!");
			setLigado(true);
			System.out.println("�nibus Ligado!!");
			if (getQuantidadeCombustivel() <= 5) {
				System.out.println("Abastecer o �nibus Urgente!!");
			}
		}else {
			if (getQuantidadePassageiros() > 0) {
				System.out.println("Voc� n�o pode Desligar o �nibus ainda h� passageiros nele!!");
			}else {
				System.out.println("Desligando �nibus!!");
				setLigado(false);
				System.out.println("�nibus Desligado!!");
			}
		}
	}
	@Override
	public void numberOfPassengers() {
		System.out.println("Nesse momento no �nibus tem: " + getQuantidadePassageiros() + " Passageiro(s)");

	}
	@Override
	public void maxWeight() {
		// TODO Auto-generated method stub

	}
	@Override
	public void drive() {
		if (isLigado() == false) {
			System.out.println("Voc� precisa Ligar o �nibus: " + getNome() + " Primeiro!");
		}else {
			System.out.println("Estou dirigindo o �nibus: " + getNome());
			if((getQuantidadeCombustivel() - 25) <= 0) {
				System.out.println("Acabou o Combust�vel!!");
				setLigado(false);
				setQuantidadeCombustivel(0);
				System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combust�vel");
			}else {
				setQuantidadeCombustivel(getQuantidadeCombustivel() - 25);
			}	
		}	
	}
	@Override
	public void abastecer() {
		if ((getQuantidadeCombustivel() + 100) >= getCapacidadeTanqueCombustivel()) {
			setQuantidadeCombustivel(getCapacidadeTanqueCombustivel());
			System.out.println("Tanque Cheio!");
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combust�vel");
		}else {
			setQuantidadeCombustivel(getQuantidadeCombustivel() + 100);
			System.out.println("Abastecendo Tanque!!");
			System.out.println("Foi Adicionado 100l de: " + getTipoCombustivel());
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combust�vel");
		}	
	}
	public void completarTanque() {
		if (getQuantidadeCombustivel() != getCapacidadeTanqueCombustivel()) {
			System.out.println("Completando Tanque!!");
			setQuantidadeCombustivel(getCapacidadeTanqueCombustivel());
		}else {
			System.out.println("Tanque Cheio!");
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combust�vel");
		}
	}
	public void pegaPassageiro() {
		if(isLigado() == false) {
			System.out.println("� preciso ligar o �nibus e digirir-se at� um ponto primeiro.");
		}else {
			if((getQuantidadePassageiros() + 1) >= getCapacidadePassageiros()) {
				System.out.println("�nibus Lotado!!");
			}else {
				System.out.println("Pegando Passageiro!!");
				setQuantidadePassageiros(getQuantidadePassageiros() + 1);
				numberOfPassengers();
			}
		}
	}
	public void deixaPassageiro() {
		if(getQuantidadePassageiros() == 0) {
			System.out.println("N�o h� passageiros!!");
		}else {
			System.out.println("Deixando Passageiro!!");
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
