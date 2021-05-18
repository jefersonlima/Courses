package ExercicioAVA;
import java.util.Scanner;

public class Matriz {
	int[][] mat;
	static Scanner in = new Scanner(System.in);
	
	public Matriz() {
		mat = new int[4][4];
	}
	
	public void lerMatriz() {
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[1].length; j++) {
				mat[i][j] = in.nextInt();
			}
		}
	}
	
//	public void imprimeMatriz() {
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				System.out.print(mat[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
	
	public void maiorLinha(int linha) {
		int maior = 0, posicao = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(i == linha) {
					if(maior < mat[i][j] ) {
						maior = mat[i][j];
						posicao = j;
					}
				}
			}
		}
		System.out.println(maior + " " + posicao);
	}
	
	public void somaAcimaDiagonalPricipal() {
		int soma = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if (j > i) {
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.println(soma);
	}
	
	public static void main(String[] args) {
		Matriz m1 = new Matriz();
		int linha;
		m1.lerMatriz();
		//m1.imprimeMatriz();
		
		
		linha = in.nextInt();
		m1.maiorLinha(linha);
		
		m1.somaAcimaDiagonalPricipal();
		
//		Matriz m2 = new Matriz();
//		m2.lerMatriz();
//		//m2.imprimeMatriz();
//		
//		
//		linha = in.nextInt();
//		m2.maiorLinha(linha);
//		
//		m2.somaAcimaDiagonalPricipal();
//		
		in.close();
	}
}
