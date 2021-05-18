//import java.util.Scanner;
//
//public class prova {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int linha;
//		int[][] M = new int[6][6];
//		linha = in.nextInt();
//		int maior = 0, posLinha = 0, posColuna = 0;
//		
//		for( int i = 0; i < M.length; i++) {
//			for(int j = 0; j < M[i].length; j++) {
//				M[i][j] = in.nextInt();	
//			}
//		}
//		in.close();
//		
//		for( int i = linha; i == linha; i++) {
//			for(int j = 0; j < M[i].length; j++) {
//				if (M[i][j] > maior) {
//					maior = M[i][j];
//					posLinha = i;
//					posColuna = j;	
//				}
//			}
//		}
//		
//		System.out.println(maior);
//		System.out.print(posLinha + " " + posColuna);
//	}
//}