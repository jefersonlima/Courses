package URI;
import java.util.Scanner;

public class _1173_PreenchimentoDeVetor1 {

	public static void main(String[] args) {
		/*
		 * Leia um valor e fa�a um programa que coloque o valor lido na primeira posi��o
		 * de um vetor N[10]. Em cada posi��o subsequente, coloque o dobro do valor da
		 * posi��o anterior. Por exemplo, se o valor lido for 1, os valores do vetor
		 * devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.
		 * 
		 * Entrada A entrada cont�m um valor inteiro (V<=50).
		 * 
		 * Sa�da Para cada posi��o do vetor, escreva "N[i] = X", onde i � a posi��o do
		 * vetor e X � o valor armazenado na posi��o i. O primeiro n�mero do vetor N
		 * (N[0]) ir� receber o valor de V.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int [] V = new int [10];
		int valor;
		
		valor = in.nextInt();
		in.close();
		
		for(int i = 0; i < V.length; i++) {
			V[i] = valor;
			valor = valor * 2;
		}
		
		for(int i = 0; i < V.length; i++) {
			System.out.println("N[" + i + "] = " + V[i]);
		}
	}
}
