package URI;

import java.util.Scanner;

public class _1172_SubstituicaoEmVetor1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os
		 * valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
		 * 
		 * Entrada A entrada contém 10 valores inteiros, podendo ser positivos ou
		 * negativos.
		 * 
		 * Saída Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do
		 * vetor e x é o valor armazenado naquela posição.
		 */
		Scanner in = new Scanner(System.in);
		int [] X = new int [10];
		int valor;
		for (int i = 0; i < X.length; i++) {
			valor = in.nextInt();
			if (valor > 0) {
				X[i] = valor;
			}else {
				X[i] = 1;
			}
		}
		in.close();
		
		for (int i = 0; i < X.length; i++) {
			System.out.println("X[" + i + "] = " + X[i]);
		}		
	}
}
