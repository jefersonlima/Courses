package Exercicios;
import java.util.Scanner;

public class ExercicioAula3Slide3 {

	public static void main(String[] args) {
		/*
		Verificar se um aluno foi aprovado na disciplina, lendo
		as notas de duas provas e verificando a sua média.
		Use o comando if/else
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.print("Informe a primeira Nota: ");
		nota1 = entrada.nextDouble();
		System.out.print("Informe a segunda Nota: ");
		nota2 = entrada.nextDouble();
		entrada.close();
		
		media = (nota1 + nota2) / 2;
		
		if (media < 5) {
			System.out.print("Aluno REPROVADO");
		}else if(media >= 5 && media < 7) {
			System.out.print("Aluno esta de EXAME");
		}else {
			System.out.print("Aluno APROVADO");
		}
	}
}
