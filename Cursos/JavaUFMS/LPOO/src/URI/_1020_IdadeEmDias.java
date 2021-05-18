package URI;

import java.util.Scanner;

public class _1020_IdadeEmDias {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e
		 * informe-a em anos, meses e dias
		 * 
		 * Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo
		 * mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12
		 * meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com
		 * objetivo de testar raciocínio matemático simples.
		 * 
		 * Entrada O arquivo de entrada contém um valor inteiro.
		 * 
		 * Saída Imprima a saída conforme exemplo fornecido.
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
