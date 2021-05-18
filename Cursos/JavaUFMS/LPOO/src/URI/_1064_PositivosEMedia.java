package URI;
import java.util.Scanner;

public class _1064_PositivosEMedia {

	public static void main(String[] args) {
		/*
		 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram
		 * positivos. Na próxima linha, deve-se mostrar a média de todos os valores
		 * positivos digitados, com um dígito após o ponto decimal.
		 * 
		 * Entrada A entrada contém 6 números que podem ser valores inteiros ou de ponto
		 * flutuante. Pelo menos um destes números será positivo.
		 * 
		 * Saída O primeiro valor de saída é a quantidade de valores positivos. A
		 * próxima linha deve mostrar a média dos valores positivos digitados.
		 */
		Scanner in = new Scanner(System.in);
		int contador = 1, contadorMedia = 0;
		float numero;
		float media = 0;
		while (contador <= 6) {
			numero = in.nextFloat();
			if (numero >= 0) {
				media = media + numero;
				contadorMedia = contadorMedia +1;
			}
			contador = contador +1;
		}
		in.close();
		media = media / contadorMedia;
		System.out.println(contadorMedia + " valores positivos");
		System.out.printf("%,.1f\n",media);
	}

}
