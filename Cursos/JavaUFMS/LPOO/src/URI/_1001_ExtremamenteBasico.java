package URI;
import java.util.Scanner;

public class _1001_ExtremamenteBasico {

	public static void main(String[] args) {
		/*
		 Leia 2 valores inteiros e armazene-os nas vari�veis A e B. Efetue a soma de A e B atribuindo o seu resultado na vari�vel X. 
		 Imprima X conforme exemplo apresentado abaixo. N�o apresente mensagem alguma al�m daquilo que est� sendo especificado e n�o 
		 esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".

		Entrada
		A entrada cont�m 2 valores inteiros.

		Sa�da
		Imprima a mensagem "X = " (letra X mai�scula) seguido pelo valor da vari�vel X e pelo final de linha. 
		Cuide para que tenha um espa�o antes e depois do sinal de igualdade, conforme o exemplo abaixo.
		 */
		
		int A, B, X;
        
		Scanner teclado = new Scanner(System.in);

			
		A = teclado.nextInt();
		B = teclado.nextInt();

		X = A + B;

		System.out.println("X = " + X);
		
		teclado.close();

	}

}
