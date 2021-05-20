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
			System.out.println("Ligando Ônibus!!");
			setLigado(true);
			System.out.println("Ônibus Ligado!!");
			if (getQuantidadeCombustivel() <= 5) {
				System.out.println("Abastecer o Ônibus Urgente!!");
			}
		}else {
			if (getQuantidadePassageiros() > 0) {
				System.out.println("Você não pode Desligar o ônibus ainda há passageiros nele!!");
			}else {
				System.out.println("Desligando Ônibus!!");
				setLigado(false);
				System.out.println("Ônibus Desligado!!");
			}
		}
	}
	@Override
	public void numberOfPassengers() {
		System.out.println("Nesse momento no ônibus tem: " + getQuantidadePassageiros() + " Passageiro(s)");

	}
	@Override
	public void maxWeight() {
		// TODO Auto-generated method stub

	}
	@Override
	public void drive() {
		if (isLigado() == false) {
			System.out.println("Você precisa Ligar o Ônibus: " + getNome() + " Primeiro!");
		}else {
			System.out.println("Estou dirigindo o ônibus: " + getNome());
			if((getQuantidadeCombustivel() - 25) <= 0) {
				System.out.println("Acabou o Combustível!!");
				setLigado(false);
				setQuantidadeCombustivel(0);
				System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combustível");
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
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combustível");
		}else {
			setQuantidadeCombustivel(getQuantidadeCombustivel() + 100);
			System.out.println("Abastecendo Tanque!!");
			System.out.println("Foi Adicionado 100l de: " + getTipoCombustivel());
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combustível");
		}	
	}
	public void completarTanque() {
		if (getQuantidadeCombustivel() != getCapacidadeTanqueCombustivel()) {
			System.out.println("Completando Tanque!!");
			setQuantidadeCombustivel(getCapacidadeTanqueCombustivel());
		}else {
			System.out.println("Tanque Cheio!");
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combustível");
		}
	}
	public void pegaPassageiro() {
		if(isLigado() == false) {
			System.out.println("É preciso ligar o ônibus e digirir-se até um ponto primeiro.");
		}else {
			if((getQuantidadePassageiros() + 1) >= getCapacidadePassageiros()) {
				System.out.println("Ônibus Lotado!!");
			}else {
				System.out.println("Pegando Passageiro!!");
				setQuantidadePassageiros(getQuantidadePassageiros() + 1);
				numberOfPassengers();
			}
		}
	}
	public void deixaPassageiro() {
		if(getQuantidadePassageiros() == 0) {
			System.out.println("Não há passageiros!!");
		}else {
			System.out.println("Deixando Passageiro!!");
			setQuantidadePassageiros(getQuantidadePassageiros() - 1);
			numberOfPassengers();
		}
	}
	@Override
 	public void imprimir() {
		System.out.println(
				"\n*DADOS DO ÔNIBUS*" +
				"\nNome: " + getNome() +
				"\nCor do ônibus: " + getCor() +
				"\nMarca: " + getMarca() +
				"\nVelocidade Max: " + getVelocidade() + "k/h" +
				"\nQuantidade de rodas: " + getQuantidadeRodas() +
				"\ntipo de Combustivel: " + getTipoCombustivel() +
				"\nCapacidade Máxima de Passageiros: " + getCapacidadePassageiros() 
				);	
	}
}
