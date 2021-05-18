package URI;

import java.util.Scanner;

public class _1180_MenorEPosicao {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia um valor N. Este N ser� o tamanho de um vetor X[N].
		 * A seguir, leia cada um dos valores de X, encontre o menor elemento deste
		 * vetor e a sua posi��o dentro do vetor, mostrando esta informa��o.
		 * 
		 * Entrada A primeira linha de entrada contem um �nico inteiro N (1 < N < 1000),
		 * indicando o n�mero de elementos que dever�o ser lidos em seguida para o vetor
		 * X[N] de inteiros. A segunda linha cont�m cada um dos N valores, separados por
		 * um espa�o.
		 * 
		 * Sa�da A primeira linha apresenta a mensagem �Menor valor:� seguida de um
		 * espa�o e do menor valor lido na entrada. A segunda linha apresenta a mensagem
		 * �Posicao:� seguido de um espa�o e da posi��o do vetor na qual se encontra o
		 * menor valor lido, lembrando que o vetor inicia na posi��o zero.
		 */
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), j = 0;
		int[] X = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = in.nextInt();
		}
		in.close();
		N = 1000;
		for(int i = 0; i < X.length; i++) {
			if (X[i] < N) {
				N = X[i];
				j = i;
			}
		}
		System.out.println("Menor valor: " + X[j]);
		System.out.println("Posicao: " + j);
	}

}
