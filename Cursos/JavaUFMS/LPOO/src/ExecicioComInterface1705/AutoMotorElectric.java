package ExecicioComInterface1705;

public class AutoMotorElectric extends Vehicle implements Electric, Passengers {
	private boolean ligado;
	private int capacidadePassageiros;
	private int quantidadePassageiros;
	private double capacidadeCargaBateria;
	private double quantidadeCargaBateria;
	
	public AutoMotorElectric(String nome, String cor, String marca, Double velocidade, int quantidadeRodas, int capacidadePassageiros, double capacidadeCargaBateria) {
		super(nome, cor, marca, velocidade, quantidadeRodas);
		this.ligado = false;
		this.quantidadePassageiros = 0;
		this.quantidadeCargaBateria = 5;
		this.capacidadeCargaBateria = capacidadeCargaBateria;
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

	public double getCapacidadeCargaBateria() {
		return capacidadeCargaBateria;
	}

	public void setCapacidadeCargaBateria(double capacidadeCargaBateria) {
		this.capacidadeCargaBateria = capacidadeCargaBateria;
	}

	public double getQuantidadeCargaBateria() {
		return quantidadeCargaBateria;
	}

	public void setQuantidadeCargaBateria(double quantidadeCargaBateria) {
		this.quantidadeCargaBateria = quantidadeCargaBateria;
	}

	@Override
	public void drive() {
		if (isLigado() == false) {
			System.out.println("Voc� precisa Ligar o Ve�culo: " + getNome() + " Primeiro!");
		}else {
			System.out.println("Estou dirigindo o Ve�culo: " + getNome());
			if((getQuantidadeCargaBateria() - 1) <= 0) {
				System.out.println("Acabou a Carga!!");
				setLigado(false);
				setQuantidadeCargaBateria(0);
				System.out.println("Carga com: " + getQuantidadeCargaBateria() + "L de Energia");
			}else {
				setQuantidadeCargaBateria(getQuantidadeCargaBateria() - 1);
			}	
		}
	}

	@Override
	public void start() {
		if (isLigado() == false) {
			System.out.println("Ligando Ve�culo!!");
			if(getQuantidadeCargaBateria() == 0) {
				System.out.println("N�o � possivel ligar! Ve�culo sem Carga!");
				System.out.println("Por favor abastecer!!");
			}else {
				setLigado(true);
				System.out.println("Ve�culo Ligado!!");
				if (getQuantidadeCargaBateria() <= 5) {
					System.out.println("Carregar o Ve�culo Urgente!!");
				}
			}
		}else {
			System.out.println("Desligando Ve�culo!!");
			if (getQuantidadePassageiros() > 0) {
				System.out.println("Voc� n�o pode Desligar o Ve�culo ainda h� passageiros nele!!");
			}else {
				setLigado(false);
				System.out.println("Ve�culo Desligado!!");
			}
		}	
	}

	@Override
	public void numberOfPassengers() {
		System.out.println("Nesse momento no Ve�culo tem: " + getQuantidadePassageiros() + " Passageiro(s)");
		
	}

	@Override
	public void carregarBateria() {
		System.out.println("Carregando!!");
		if ((getQuantidadeCargaBateria() + 100) >= getCapacidadeCargaBateria()) {
			setQuantidadeCargaBateria(getCapacidadeCargaBateria());
			System.out.println("Carga Cheia!");
			System.out.println("Carga com: " + getQuantidadeCargaBateria() + " Energia");
		}else {
			setQuantidadeCargaBateria(getQuantidadeCargaBateria() + 10);
			System.out.println("Foi Adicionado 10% de carga!");
			System.out.println("Carga com: " + getQuantidadeCargaBateria() + " Energia");
		}
		
	}

}
