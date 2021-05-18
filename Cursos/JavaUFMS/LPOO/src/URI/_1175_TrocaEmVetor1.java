package URI;
import java.util.Scanner;

public class _1175_TrocaEmVetor1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro
		 * elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o
		 * 10º com o 11º. Mostre o vetor modificado.
		 * 
		 * Entrada A entrada contém 20 valores inteiros, positivos ou negativos.
		 * 
		 * Saída Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do
		 * vetor e Y é o valor armazenado naquela posição.
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
