package ExecicioComInterface1705;

public class AutoMotor extends Vehicle implements Fuel, Passengers {
	private boolean ligado;
	private int capacidadePassageiros;
	private int quantidadePassageiros;
	private double capacidadeTanqueCombustivel;
	private double quantidadeCombustivel;
	private String tipoCombustivel;
	
	public AutoMotor(String nome, String cor, String marca, Double velocidade, int quantidadeRodas, String tipoCombustivel, int capacidadePassageiros, double capacidadeTanqueCombustivel) {
		super(nome, cor, marca, velocidade, quantidadeRodas);
		this.ligado = false;
		this.quantidadePassageiros = 0;
		this.quantidadeCombustivel = 5;
		this.tipoCombustivel = tipoCombustivel;
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
	public void drive() {
		if (isLigado() == false) {
			System.out.println("Você precisa Ligar o Veículo: " + getNome() + " Primeiro!");
		}else {
			System.out.println("Estou dirigindo o Veículo: " + getNome());
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
	public void start() {
		if (isLigado() == false) {
			System.out.println("Ligando Veículo!!");
			if(getQuantidadeCombustivel() == 0) {
				System.out.println("Não é possivel ligar! Veículo sem Combustível!");
				System.out.println("Por favor abastecer!!");
			}else {
				setLigado(true);
				System.out.println("Veículo Ligado!!");
				if (getQuantidadeCombustivel() <= 5) {
					System.out.println("Abastecer o Veículo Urgente!!");
				}
			}
		}else {
			System.out.println("Desligando Veículo!!");
			if (getQuantidadePassageiros() > 0) {
				System.out.println("Você não pode Desligar o Veículo ainda há passageiros nele!!");
			}else {
				setLigado(false);
				System.out.println("Veículo Desligado!!");
			}
		}
	}

	@Override
	public void numberOfPassengers() {
		System.out.println("Nesse momento no Veículo tem: " + getQuantidadePassageiros() + " Passageiro(s)");
		
	}

	@Override
	public void abastecer() {
		System.out.println("Abastecendo Tanque!!");
		if ((getQuantidadeCombustivel() + 100) >= getCapacidadeTanqueCombustivel()) {
			setQuantidadeCombustivel(getCapacidadeTanqueCombustivel());
			System.out.println("Tanque Cheio!");
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combustível");
		}else {
			setQuantidadeCombustivel(getQuantidadeCombustivel() + 100);
			System.out.println("Foi Adicionado 100l de: " + getTipoCombustivel());
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combustível");
		}	
	}

	@Override
	public void completarTanque() {
		if (getQuantidadeCombustivel() != getCapacidadeTanqueCombustivel()) {
			System.out.println("Completando Tanque!!");
			setQuantidadeCombustivel(getCapacidadeTanqueCombustivel());
			System.out.println("Tanque Cheio!");
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combustível");
		}else {
			System.out.println("Tanque Cheio!");
			System.out.println("Tanque com: " + getQuantidadeCombustivel() + "L de Combustível");
		}	
	}

}
