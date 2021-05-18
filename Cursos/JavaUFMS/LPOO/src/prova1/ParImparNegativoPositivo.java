package prova1;
import java.util.Scanner;

public class ParImparNegativoPositivo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int contador = 0, numero = 0;
		while (contador < n) {
			numero = in.nextInt();
			if (numero % 2 == 0) {
				if (numero > 0) {
					System.out.println("PAR POSITIVO");
				} else if (numero < 0){
					System.out.println("PAR NEGATIVO");
				}else {
					System.out.println("ZERO");
				}
			} else {
				if (numero > 0) {
					System.out.println("IMPAR POSITIVO");
				} else if (numero < 0){
					System.out.println("IMPAR NEGATIVO");
				}else {
					System.out.println("ZERO");
				}
			}
			contador = contador + 1;
		}
		in.close();
	}
}
