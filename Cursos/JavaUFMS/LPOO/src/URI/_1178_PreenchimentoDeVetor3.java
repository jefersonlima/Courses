package URI;

import java.util.Scanner;

public class _1178_PreenchimentoDeVetor3 {

	public static void main(String[] args) {
		/*
		 * Leia um valor X. Coloque este valor na primeira posi��o de um vetor N[100].
		 * Em cada posi��o subsequente de N (1 at� 99), coloque a metade do valor
		 * armazenado na posi��o anterior, conforme o exemplo abaixo. Imprima o vetor N.
		 * 
		 * Entrada A entrada contem um valor de dupla precis�o com 4 casas decimais.
		 * 
		 * Sa�da Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do
		 * vetor e Y � o valor armazenado naquela posi��o. Cada valor do vetor deve ser
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
