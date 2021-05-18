package URI;
import java.util.Scanner;

public class _1007_Diferenca {

	public static void main(String[] args) {
		/*
		Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B 
		pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

		Entrada
		O arquivo de entrada contém 4 valores inteiros.

		Saída
		Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
		 */

		int A, B, C, D, DIFERENCA;
        Scanner teclado = new Scanner(System.in);
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = "+DIFERENCA);
        teclado.close();
	}

}
