package URI;
import java.util.Scanner;

public class _1435_MatrizQuadrada1 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*
		 * Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100), correspondente a
		 * ordem de uma matriz M de inteiros, e construa a matriz de acordo com o
		 * exemplo abaixo.
		 * 
		 * Entrada A entrada consiste de vários inteiros, um valor por linha,
		 * correspondentes as ordens das matrizes a serem construídas. O final da
		 * entrada é marcado por um valor de ordem igual a zero (0).
		 * 
		 * Saída Para cada inteiro da entrada imprima a matriz correspondente, de acordo
		 * com o exemplo. Os valores das matrizes devem ser formatados em um campo de
		 * tamanho 3 justificados à direita e separados por espaço. Após o último
		 * caractere de cada linha da matriz não deve haver espaços em branco. Após a
		 * impressão de cada matriz deve ser deixada uma linha em branco.
		 */		
		
		int[][] M;
		
		int N = 1,hn = 0, l, a, b;
		N = in.nextInt();
		M = new int[N][N];
		while (N != 0) {
			if (N > 0 && N < 100) {
				
				hn = N / 2;
				if (N % 2 == 1) {
					hn++;
				}
				a = 0;
				b = N -1;
				for(l = 1; l <= hn; l++) {
					for (int i = a; i <= b; i++) { 
						for (int j = a; j <= b; j++) {
							M[i][j] = l;
						}
					}
					a++;
					b--;
				}				
//				for (int i = 0; i < N; i++) { 
//					for (int j = 0; j < N; j++) {
//						M[i][j] = 1;
//					}
//				}
				for (int i = 0; i < N; i++) { 
					for (int j = 0; j < N; j++) {
						if(j == 0) {
							System.out.printf("%3d", M[i][j]);
						}else {
							System.out.printf(" %3d", M[i][j]);
						}
					}
					System.out.println();
				}
				System.out.println();
				N = in.nextInt();
				M = new int[N][N];
			}
		}
	}
}
