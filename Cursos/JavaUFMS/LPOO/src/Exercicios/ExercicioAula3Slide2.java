package Exercicios;

import java.util.Scanner;

public class ExercicioAula3Slide2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa chamado Switch que realize as 4 operações (+), (-), (/) e
		 * (*) entre duas variáveis, através da escolha do usuário. Use o comando switch
		 */
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2 = 0;
		char operacao = ' ';

		System.out.printf("Infomer o primeiro numero: ");
		numero1 = entrada.nextInt();
		System.out.printf("Informe o segundo numero: ");
		numero2 = entrada.nextInt();
		System.out.printf("Informe a operacao: ");
		entrada.close();
		
		operacao = entrada.next().charAt(0);

		switch (operacao) {

		case '+':
			System.out.print("Soma do numero " + numero1 + " com o numero " + numero2 + " eh: " + (numero1 + numero2));
			break;
		case '-':
			System.out.print(
					"Subtracao do numero " + numero1 + " com o numero " + numero2 + " eh: " + (numero1 - numero2));
			break;
		case '*':
			System.out.print(
					"Multiplicacao do numero " + numero1 + " pelo numero " + numero2 + " eh: " + (numero1 * numero2));
			break;
		case '/':
			System.out.print("Divao do numero " + numero1 + " pelo numero " + numero2 + " eh: " + (numero1 / numero2));
			break;
		default:
			System.out.print("Operacao Invalida!");
		}
	}
}
