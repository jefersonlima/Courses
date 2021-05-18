package ExemplosAula;

import java.util.Scanner;

public class Matriz {
	int [][] matriz;
	
	public Matriz(int l, int c) {
		matriz = new int[l][c];
	}
	
	public void lerMatriz() {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				matriz[i][j] = in.nextInt();
			}
		}
		in.close();
	}
	
	public int somarMatriz() {
		int soma = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				soma = soma + matriz[i][j];
			}
		}
		return soma;
	}
	
	public void imprimirMatriz() {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		Matriz m1 = new Matriz(2, 3);
		m1.lerMatriz();
		m1.imprimirMatriz();
		System.out.println("A soma da Matriz é: "+ m1.somarMatriz());
		
//		Matriz m2 = new Matriz(3, 3);
//		m2.lerMatriz();
//		m2.imprimirMatriz();
//		System.out.println("A soma da Matriz é: "+ m2.somarMatriz());
//		

	}
	
	

}
