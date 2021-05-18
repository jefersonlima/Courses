package URI;

import java.util.Scanner;

public class _1075_Resto2 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que
		 * divididos por N dão resto igual a 2.
		 * 
		 * Entrada A entrada contém um valor inteiro N (N < 10000).
		 * 
		 * Saída Imprima todos valores que quando divididos por N dão resto = 2, um por
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
