//Lib
import java.util.Scanner;

import Menu.MenuVacina;
// Import class
import Pessoa.Pessoa;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MenuVacina vacina;
		
		System.out.println(
				"Bem-vindo ao sistema de vacina!\n"
				+ "Selecione as ações abaixo:\n"
				+ "1 - Vacina\n"
				+ "2 - Local\n"
				+ "3 - Enfermeiros\n"
				+ "4 - Pessoas\n"
				+ "0 - Sair"
		);
		
		int op = in.nextInt();
		
		switch(op) {
		case 1: 
			// Vacina
			System.out.println(
				"Selecione as ações abaixo:\n"
				+ "1 - Cadastrar\n"
				+ "2 - Listar\n"
				+ "3 - Alterar\n"
				+ "4 - Deletar\n"
				+ "0 - Voltar"
			);
		break;
		case 2: 
			// Local
		break;
		case 3:
			// Enfermeiros
		break;
		case 4:
			// Pessoas
		break;
		default:
			System.out.println("Obrigado por ultilizar nosso sistema!");
		break;
		}
		
		in.close();
		
		
	}

}
