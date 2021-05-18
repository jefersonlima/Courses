package URI;

import java.util.Scanner;

public class _1172_SubstituicaoEmVetor1 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia um vetor X[10]. Substitua a seguir, todos os
		 * valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
		 * 
		 * Entrada A entrada cont�m 10 valores inteiros, podendo ser positivos ou
		 * negativos.
		 * 
		 * Sa�da Para cada posi��o do vetor, escreva "X[i] = x", onde i � a posi��o do
		 * vetor e x � o valor armazenado naquela posi��o.
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
