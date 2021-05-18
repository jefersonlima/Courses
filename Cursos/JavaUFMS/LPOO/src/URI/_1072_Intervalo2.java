package URI;

import java.util.Scanner;

public class _1072_Intervalo2 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X
		 * que ser�o lidos em seguida. Mostre quantos destes valores X est�o dentro do
		 * intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas
		 * informa��es.
		 * 
		 * Entrada A primeira linha da entrada cont�m um valor inteiro N (N < 10000),
		 * que indica o n�mero de casos de teste. Cada caso de teste a seguir � um valor
		 * inteiro X (-107 < X <107).
		 * 
		 * 
		 * Sa�da Para cada caso, imprima quantos n�meros est�o dentro (in) e quantos
		 * valores est�o fora (out) do intervalo.
		 */
		Scanner in = new Scanner(System.in);
		int N, contador = 0, numero = 0, contadorIn = 0, contadorOut = 0;
		
		N = in.nextInt();
		while (contador < N) {
			numero = in.nextInt();
			if (numero >= 10 && numero <= 20) {
				contadorIn = contadorIn +1;
			}else if (numero < 10  || numero > 20) {
				contadorOut = contadorOut +1;
			}
			contador = contador +1;
		}
		in.close();
		System.out.println(contadorIn + " in");
		System.out.println(contadorOut + " out");
		
		
	}

}
