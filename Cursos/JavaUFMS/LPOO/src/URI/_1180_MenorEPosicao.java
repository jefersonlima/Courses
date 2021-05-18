package URI;

import java.util.Scanner;

public class _1180_MenorEPosicao {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N].
		 * A seguir, leia cada um dos valores de X, encontre o menor elemento deste
		 * vetor e a sua posição dentro do vetor, mostrando esta informação.
		 * 
		 * Entrada A primeira linha de entrada contem um único inteiro N (1 < N < 1000),
		 * indicando o número de elementos que deverão ser lidos em seguida para o vetor
		 * X[N] de inteiros. A segunda linha contém cada um dos N valores, separados por
		 * um espaço.
		 * 
		 * Saída A primeira linha apresenta a mensagem “Menor valor:” seguida de um
		 * espaço e do menor valor lido na entrada. A segunda linha apresenta a mensagem
		 * “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra o
		 * menor valor lido, lembrando que o vetor inicia na posição zero.
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
