package Exercicios;

public class ExercicioAula2DefinaVariaveis {

	public static void main(String[] args) {		
		/*Defina em Java as seguintes vari�veis:
			idade
			nome
			peso
			tipo Sangu�neo (sem fator RH - +)
			anivers�rio
			n�mero que cal�a
			casado ou n�o
		 */
		
		int idade = 37;
		String nome = "Jeferson";
		float peso = 78.0f;
		char tipoSanguineo = 'O';
		String aniversario = "22/03/2021";
		int numeroCalcado = 40;
		boolean casado = true;
		
		System.out.println("A idade eh: "+ idade);
		System.out.println("O nome eh: "+nome);
		System.out.println("O peso eh: "+peso);
		System.out.println("O tipo Sanguineo eh: "+tipoSanguineo);
		System.out.println("A data do aniversario eh: "+aniversario);
		System.out.println("O numero do calcado eh: "+numeroCalcado);
		System.out.println("eh casado? "+casado);
		
	}

}
