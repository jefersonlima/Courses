package Erros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		
		System.out.print("Informe sua idade: ");
		try {
			idade = in.nextInt();
			System.out.print("Sua idade �: " + idade);
		}catch(InputMismatchException e){
			System.out.print("Voc� precisa digitar um numero");
		}
		in.close();
	}
}
