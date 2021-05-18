package URI;

import java.util.Scanner;

public class _1044_Multiplos {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
		 * m�ltiplos entre si.
		 * 
		 * Entrada A entrada cont�m valores inteiros.
		 * 
		 * Sa�da A sa�da deve conter uma das mensagens conforme descrito acima.
		 */
		Scanner in = new Scanner(System.in);
				
		int A, B;
		
		A = in.nextInt();
		B = in.nextInt();
		
		in.close();
		
		if (B%A == 0 || A%B == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}

	}

}
