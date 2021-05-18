package URI;

import java.util.Scanner;

public class _1178_PreenchimentoDeVetor3 {

	public static void main(String[] args) {
		/*
		 * Leia um valor X. Coloque este valor na primeira posição de um vetor N[100].
		 * Em cada posição subsequente de N (1 até 99), coloque a metade do valor
		 * armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.
		 * 
		 * Entrada A entrada contem um valor de dupla precisão com 4 casas decimais.
		 * 
		 * Saída Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do
		 * vetor e Y é o valor armazenado naquela posição. Cada valor do vetor deve ser
		 * apresentado com 4 casas decimais.
		 */
		Scanner in = new Scanner(System.in);

		double[] V = new double[100];
		double X;

		X = in.nextDouble();
		in.close();

		for (int i = 0; i < V.length; i++) {
			V[i] = X;
			X = X / 2;
			System.out.printf("N[" + i + "] = %.4f\n", V[i]);
		}
	}
}
