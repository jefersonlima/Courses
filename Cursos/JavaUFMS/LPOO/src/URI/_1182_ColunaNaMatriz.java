package URI;

import java.util.Scanner;

public class _1182_ColunaNaMatriz {

	public static void main(String[] args) {
		/*
		 * Neste problema você deve ler um número que indica uma coluna de uma matriz na
		 * qual uma operação deve ser realizada, um caractere maiúsculo, indicando a
		 * operação que será realizada, e todos os elementos de uma matriz M[12][12]. Em
		 * seguida, calcule e mostre a soma ou a média dos elementos que estão na área
		 * verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso da
		 * entrada do valor 5 para a coluna da matriz, demonstrando os elementos que
		 * deverão ser considerados na operação.
		 * 
		 * 
		 * 
		 * 
		 * Entrada A primeira coluna de entrada contem um número C (0 ≤ C ≤ 11) indicando
		 * a coluna que será considerada para operação. A segunda coluna de entrada
		 * contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação
		 * (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem
		 * os 144 valores de ponto flutuante que compõem a matriz.
		 * 
		 * Saída Imprima o resultado solicitado (a soma ou média), com 1 casa após o
		 * ponto decimal.
		 */
		Scanner in = new Scanner(System.in);
		int coluna;
		char T;
		double[][] M = new double[2][2];
		double resultado = 0;
		coluna = in.nextInt();
		T = in.next().charAt(0);
		
		for( int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				M[i][j] = in.nextDouble();	
			}
		}
		in.close();
		
//		for( int i = 0; i < M.length; i++) {
//			for(int j = 0; j < M[i].length; j++) {
//				System.out.print(M[i][j] + " ");	
//			}
//			System.out.println();
//		}
		
		for( int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				if (j == coluna) {
					resultado = resultado + M[i][j];
				}
			}
		}
		
		if (T == 'S') {
			System.out.println(resultado);
		}else if(T == 'M'){
			resultado = resultado / M[coluna].length;
			System.out.printf("%.1f\n", resultado);
		}	
	}
}
