package ExecicioComInterface1705;

public class Main {

	public static void main(String[] args) {
		//Instanciando a classe Bike
		Bike b1 = new Bike("Caloi 10", "Preto", "Caloi", 80.0, 2, "Corrida", 100.00);
		
		//Teste Gets
		System.out.println(b1.getNome());
		System.out.println(b1.getCor());
		System.out.println(b1.getMarca());
		System.out.println(b1.getVelocidade());
		System.out.println(b1.getTipoBike());
		
		//Testes Metodos
		b1.imprimir();
		b1.drive();
		b1.maxWeight();
	}

}
