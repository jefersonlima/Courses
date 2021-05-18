package URI;
import java.util.Scanner;

public class _1038_Lanche {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * Entrada O arquivo de entrada contém dois valores inteiros correspondentes ao
		 * código e à quantidade de um item conforme tabela acima.
		 * 
		 * Saída O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo
		 * valor a ser pago, com 2 casas após o ponto decimal.
		 */
		Scanner in = new Scanner(System.in);
		
		int codigo, quantidade;
		
		codigo = in.nextInt();
		quantidade = in.nextInt();
		
		in.close();
		
		if (codigo == 1) {
			System.out.printf("Total: R$ %.2f\n",4.00 * quantidade );
		}else if (codigo == 2) {
			System.out.printf("Total: R$ %.2f\n",4.50 * quantidade );
		}else if (codigo == 3) {
			System.out.printf("Total: R$ %.2f\n",5.00 * quantidade );
		}else if (codigo == 4) {
			System.out.printf("Total: R$ %.2f\n",2.00 * quantidade );
		}else if (codigo == 5) {
			System.out.printf("Total: R$ %.2f\n",1.50 * quantidade );
		}
	}
}
