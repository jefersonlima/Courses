package URI;
import java.util.Scanner;

public class _1004_ProdutoSimples {

	public static void main(String[] args) {
		/*
		Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta opera��o � vari�vel PROD. 
		A seguir mostre a vari�vel PROD com mensagem correspondente.   

		Entrada
		O arquivo de entrada cont�m 2 valores inteiros.

		Sa�da
		Imprima a mensagem "PROD" e a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade. 
		N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
		 */

	 	int A,B,PROD;
        Scanner teclado = new Scanner(System.in);
        
        A=teclado.nextInt();
        B=teclado.nextInt();
        PROD= A*B;
        System.out.println("PROD = "+PROD);
        teclado.close();
	}

}
