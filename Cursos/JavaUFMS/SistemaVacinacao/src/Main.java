//Lib
import java.util.Scanner;

import Menu.MenuVacina;
// Import class
import Pessoa.Pessoa;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MenuVacina vacina;
		
		int op = in.nextInt();
		
		System.out.println(
				"Bem-vindo ao sistema de vacina!\n"
				+ "Selecione as ações abaixo:/n"
				+ "1 - Vacina/n"
				+ "2 - Local/n"
				+ "3 - Enfermeiros/n"
				+ "4 - Pessoas/n"
				+ "0 - Sair"
		);
		
		switch(op) {
		case 1: 
			// Vacina
			vacina = new MenuVacina();
			vacina.getMenuVacina(in.nextInt());
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
		
		
	}

}
