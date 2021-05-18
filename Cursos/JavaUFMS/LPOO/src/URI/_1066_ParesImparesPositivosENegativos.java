package URI;

import java.util.Scanner;

public class _1066_ParesImparesPositivosENegativos {

	public static void main(String[] args) {
		/*
		 * Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram
		 * pares, quantos valores digitados foram ímpares, quantos valores digitados
		 * foram positivos e quantos valores digitados foram negativos.
		 * 
		 * Entrada O arquivo de entrada contém 5 valores inteiros quaisquer.
		 * 
		 * Saída Imprima a mensagem conforme o exemplo fornecido, uma mensagem por
		 * linha, não esquecendo o final de linha após cada uma.
		 */
		Scanner in = new Scanner(System.in);
		int contador = 1, contadorPar = 0, contadorInpar = 0, contadorPositivo = 0, contadorNegativo = 0;
		float numero;

		while (contador <= 5) {
			numero = in.nextFloat();
			if (numero % 2 == 0) {
				contadorPar = contadorPar + 1;
				if (numero > 0) {
					contadorPositivo = contadorPositivo + 1;
				} else if (numero < 0){
					contadorNegativo = contadorNegativo + 1;
				}
			} else {
				contadorInpar = contadorInpar + 1;
				if (numero > 0) {
					contadorPositivo = contadorPositivo + 1;
				} else if (numero < 0){
					contadorNegativo = contadorNegativo + 1;
				}
			}
			contador = contador + 1;
		}
		in.close();

		System.out.println(contadorPar + " valor(es) par(es)");
		System.out.println(contadorInpar + " valor(es) impar(es)");
		System.out.println(contadorPositivo + " valor(es) positivo(s)");
		System.out.println(contadorNegativo + " valor(es) negativo(s)");
	}

}
