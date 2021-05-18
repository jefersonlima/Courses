package URI;
import java.util.Scanner;

public class _1073_QuadradoDePares {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares,
		 * de 1 até N, inclusive N, se for o caso.
		 * 
		 * Entrada A entrada contém um valor inteiro N (5 < N < 2000).
		 * 
		 * Saída Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o
		 * exemplo abaixo.
		 * 
		 * Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída
		 * 1e+006 ao invés de 1000000 o que ocasionará resposta errada. Neste caso,
		 * configure a precisão adequadamente para que isso não ocorra.
		 */
		Scanner in = new Scanner(System.in);
		int N, contador = 1;
		
		N = in.nextInt();
		in.close();
		while (contador <= N) {
			if (contador % 2 == 0) {
				System.out.println(contador + "^2 = " + (int)Math.pow(contador, 2));
			}
			contador = contador +1;
		}
	}
}
