package URI;
import java.util.Scanner;

public class _1042_SortSimples {

	public static void main(String[] args) {
		/*
		 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os
		 * valores em ordem crescente, uma linha em branco e em seguida, os valores na
		 * sequência como foram lidos.
		 * 
		 * Entrada A entrada contem três números inteiros.
		 * 
		 * Saída Imprima a saída conforme foi especificado.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int vetorOriginal[] = new int[3];
		
		vetorOriginal[0] = in.nextInt();
		vetorOriginal[1] = in.nextInt();
		vetorOriginal[2] = in.nextInt();
		
		in.close();
		
		int vetorOrdenado[] = new int[3];
		
		if (vetorOriginal[0] < vetorOriginal[1] && vetorOriginal[0] < vetorOriginal[2]) {
			vetorOrdenado[0] = vetorOriginal[0];
			if (vetorOriginal[1] < vetorOriginal[2]) {
				vetorOrdenado[1] = vetorOriginal[1];
				vetorOrdenado[2] = vetorOriginal[2];
			}else {
				vetorOrdenado[1] = vetorOriginal[2];
				vetorOrdenado[2] = vetorOriginal[1];
			}
		} else if (vetorOriginal[1] < vetorOriginal[0] && vetorOriginal[1] < vetorOriginal[2]) {
			vetorOrdenado[0] = vetorOriginal[1];
			if (vetorOriginal[0] < vetorOriginal[2]) {
				vetorOrdenado[1] = vetorOriginal[0];
				vetorOrdenado[2] = vetorOriginal[2];
			}else {
				vetorOrdenado[1] = vetorOriginal[2];
				vetorOrdenado[2] = vetorOriginal[0];
			}
		}else if (vetorOriginal[2] < vetorOriginal[0] && vetorOriginal[2] < vetorOriginal[1]) {
			vetorOrdenado[0] = vetorOriginal[2];
			if (vetorOriginal[0] < vetorOriginal[1]) {
				vetorOrdenado[1] = vetorOriginal[0];
				vetorOrdenado[2] = vetorOriginal[1];
			}else {
				vetorOrdenado[1] = vetorOriginal[1];
				vetorOrdenado[2] = vetorOriginal[0];
			}
		}
		
		for(int i = 0; i < vetorOrdenado.length; i++) {
			System.out.println(vetorOrdenado[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < vetorOriginal.length; i++) {
			System.out.println(vetorOriginal[i]);
		}
	}

}
