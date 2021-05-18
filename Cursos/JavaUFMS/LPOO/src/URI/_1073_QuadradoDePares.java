package URI;
import java.util.Scanner;

public class _1073_QuadradoDePares {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares,
		 * de 1 at� N, inclusive N, se for o caso.
		 * 
		 * Entrada A entrada cont�m um valor inteiro N (5 < N < 2000).
		 * 
		 * Sa�da Imprima o quadrado de cada um dos valores pares, de 1 at� N, conforme o
		 * exemplo abaixo.
		 * 
		 * Tome cuidado! Algumas linguagens tem por padr�o apresentarem como sa�da
		 * 1e+006 ao inv�s de 1000000 o que ocasionar� resposta errada. Neste caso,
		 * configure a precis�o adequadamente para que isso n�o ocorra.
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
