package ExemplosAula;

import java.util.Scanner;

public class Arrays {
	
	private int[] vet;
	
	public Arrays(int n) {
		vet = new int[n];
	}
	
	public int somar() {
		int soma = 0;
		for(int i = 0;i < vet.length;i++) {
			soma = soma +vet[i];
		}
		return soma;
	}
	
	public void lerVet() {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < vet.length; i++) {
			vet[i] = in.nextInt();
		}
		in.close();	
	}
	
	public void imprimirVet() {
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Arrays a1 = new Arrays(5);
		Arrays a2 = new Arrays(6);
		
		a1.lerVet();
		a2.lerVet();
		
		a1.imprimirVet();
		a2.imprimirVet();
		
		System.out.println("Soma de A1 é: " + a1.somar());
		System.out.println("Soma de A2 é: " + a2.somar());	
	}
}
