package Exercicios;
import java.util.Scanner;

public class ExercicioAula3Slide1 {

	public static void main(String[] args) {
		/*
		Leia um número inteiro do console e diga se ele é
		impar ou par
		Faça usando o comando if/else
		Faça usando apenas o operador condicional
		*/
	
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		System.out.print("Informe um numero Inteiro: ");
		
		numero = entrada.nextInt();
		entrada.close();
		
		if (numero % 2 == 0){
			System.out.print(numero + " e par");
		}else {
			System.out.print(numero + " e impar");
		}
	}
}
