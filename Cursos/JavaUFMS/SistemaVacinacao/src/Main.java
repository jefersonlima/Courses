//Lib
import java.util.Scanner;

import Menu.MenuVacina;
// Import class
import Pessoa.Pessoa;
import Vacina.Vacina;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MenuVacina vacina = new MenuVacina();
		
		System.out.println(
				"Bem-vindo ao sistema de vacina!\n"
				+ "Selecione uma op��o:\n"
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
			vacina.getMenuVacina();
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