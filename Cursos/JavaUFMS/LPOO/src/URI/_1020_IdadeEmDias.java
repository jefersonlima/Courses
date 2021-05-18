package URI;

import java.util.Scanner;

public class _1020_IdadeEmDias {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro correspondente � idade de uma pessoa em dias e
		 * informe-a em anos, meses e dias
		 * 
		 * Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo
		 * m�s com 30 dias. Nos casos de teste nunca haver� uma situa��o que permite 12
		 * meses e alguns dias, como 360, 363 ou 364. Este � apenas um exerc�cio com
		 * objetivo de testar racioc�nio matem�tico simples.
		 * 
		 * Entrada O arquivo de entrada cont�m um valor inteiro.
		 * 
		 * Sa�da Imprima a sa�da conforme exemplo fornecido.
		 */

		Scanner entrada = new Scanner(System.in);
		int dias = 0, ano = 0, mes = 0;
		dias = entrada.nextInt();
		entrada.close();

		if (dias >= 365) {
			ano = dias / 365;
			dias = dias - (ano * 365);
		}

		if (dias >= 30) {
			mes = dias / 30;
			dias = dias - (mes * 30);
		}

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");
	}
}
