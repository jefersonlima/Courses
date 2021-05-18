package URI;

import java.util.Scanner;

public class _1075_Resto2 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Apresente todos os n�meros entre 1 e 10000 que
		 * divididos por N d�o resto igual a 2.
		 * 
		 * Entrada A entrada cont�m um valor inteiro N (N < 10000).
		 * 
		 * Sa�da Imprima todos valores que quando divididos por N d�o resto = 2, um por
		 * linha.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int N, contador = 0;
		N = in.nextInt();
		
		while (contador < 10000) {
			if ((contador % N) == 2) {
				System.out.println(contador);
			}
			contador = contador +1;
		}
		in.close();
	}

}
