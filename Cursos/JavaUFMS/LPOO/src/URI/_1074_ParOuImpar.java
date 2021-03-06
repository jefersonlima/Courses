package URI;

import java.util.Scanner;

public class _1074_ParOuImpar {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor ser? a quantidade de valores que ser?o
		 * lidos em seguida. Para cada valor lido, mostre uma mensagem em ingl?s dizendo
		 * se este valor lido ? par (EVEN), ?mpar (ODD), positivo (POSITIVE) ou negativo
		 * (NEGATIVE). No caso do valor ser igual a zero (0), embora a descri??o correta
		 * seja (EVEN NULL), pois por defini??o zero ? par, seu programa dever? imprimir
		 * apenas NULL.
		 * 
		 * Entrada A primeira linha da entrada cont?m um valor inteiro N(N < 10000) que
		 * indica o n?mero de casos de teste. Cada caso de teste a seguir ? um valor
		 * inteiro X (-107 < X <107).
		 * 
		 * Sa?da Para cada caso, imprima uma mensagem correspondente, de acordo com o
		 * exemplo abaixo. Todas as letras dever?o ser mai?sculas e sempre dever? haver
		 * um espa?o entre duas palavras impressas na mesma linha.
		 */
		
		Scanner in = new Scanner(System.in);
		int N, numero, contador = 1;

		N = in.nextInt();
		while (contador <= N) {
			numero = in.nextInt();
			if (numero % 2 == 0) {
				if (numero > 0) {
					System.out.println("EVEN POSITIVE");
				} else if (numero < 0){
					System.out.println("EVEN NEGATIVE");
				}else {
					System.out.println("NULL");
				}
			} else {
				if (numero > 0) {
					System.out.println("ODD POSITIVE");
				} else if (numero < 0){
					System.out.println("ODD NEGATIVE");
				}
			}
			contador = contador + 1;
		}
		in.close();

	}

}
