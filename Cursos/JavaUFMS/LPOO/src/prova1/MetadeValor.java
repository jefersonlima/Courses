package prova1;
import java.util.Scanner;

public class MetadeValor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		double[] V = new double[x];
		double X;

		X = in.nextDouble();
		in.close();

		for (int i = 0; i < V.length; i++) {
			V[i] = X;
			X = X / 2;
			System.out.printf("vet[" + i + "] = %.2f\n", V[i]);
		}
	}
}
