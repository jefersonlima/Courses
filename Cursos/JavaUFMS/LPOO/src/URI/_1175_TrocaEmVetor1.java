package URI;
import java.util.Scanner;

public class _1175_TrocaEmVetor1 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia um vetor N[20]. Troque a seguir, o primeiro
		 * elemento com o �ltimo, o segundo elemento com o pen�ltimo, etc., at� trocar o
		 * 10� com o 11�. Mostre o vetor modificado.
		 * 
		 * Entrada A entrada cont�m 20 valores inteiros, positivos ou negativos.
		 * 
		 * Sa�da Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do
		 * vetor e Y � o valor armazenado naquela posi��o.
		 */
		Scanner in = new Scanner(System.in);
		
		int [] N = new int [20];
		
		for(int i = 0; i < N.length; i++) {
			N[i] = in.nextInt();
		}
		in.close();
		int j = N.length - 1, aux = 0;
		for(int i = 0; i < N.length / 2; i++) {
			aux = N[i];
			N[i] = N[j];
			N[j] = aux;
			j--;
		}
		
		for(int i = 0; i < N.length; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}
	}

}
