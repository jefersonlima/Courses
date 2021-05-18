package URI;
import java.util.Scanner;

public class _1187_AreaSuperior {

	public static void main(String[] args) {
		/*
		 * Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada e
		 * uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a m�dia
		 * considerando somente aqueles elementos que est�o acima da diagonal principal
		 * da matriz, conforme ilustrado abaixo (�rea verde).
		 * 
		 * Entrada A primeira linha de entrada contem um �nico caractere Mai�sculo O
		 * ('S' ou 'M'), indicando a opera��o (Soma ou M�dia) que dever� ser realizada
		 * com os elementos da matriz. Seguem os 144 valores de ponto flutuante que
		 * comp�em a matriz.
		 * 
		 * Sa�da Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o
		 * ponto decimal.
		 */
		Scanner in = new Scanner(System.in);

		char T;
		double[][] M = new double[12][12];
		double resultado = 0;
		T = in.next().charAt(0);
		int count = 0, count2;

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = in.nextDouble();
			}
		}
		in.close();
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j] + " ");
				//System.out.printf("%.1f" + " ", M[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		count2 = M.length;
		for (int i = 0; i < M.length; i++) {
			count2--;
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(" ");
				if (j > i && j < count2) {
					System.out.print(M[i][j] + " ");
				}
				//System.out.printf("%.1f" + " ", M[i][j]);
			}
			System.out.println(" ");
		}
		
		count2 = M.length;
		for (int i = 0; i < M.length; i++) {
			count2--;
			for (int j = 0; j < M[i].length; j++) {
				if (j > i && j < count2) {
					resultado = resultado + M[i][j];
					count++;
				}
			}
		}

		if (T == 'S') {
			System.out.printf("%.1f\n", resultado);
		} else if (T == 'M') {
			resultado = resultado / count;
			System.out.printf("%.1f\n", resultado);
		}
	}
}
