//Lib
import java.util.Scanner;

import Menu.MenuPessoa;
import Menu.MenuVacina;
import Menu.MenuLocal;
// Import class
import Pessoa.Pessoa;
import Vacina.Vacina;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MenuVacina vacina = new MenuVacina();
		MenuPessoa pessoa = new MenuPessoa();
		MenuLocal localVacina = new MenuLocal();
		
		int op = 1;
		while (op != 0) { 
			System.out.println(
				"Bem-vindo ao sistema de vacina!\n"
				+ "Selecione uma op��o:\n"
				+ "1 - Vacina\n"
				+ "2 - Local\n"
				+ "3 - Enfermeiros\n"
				+ "4 - Pessoas\n"
				+ "0 - Sair"
				);
		
			op = in.nextInt();
		
			switch(op) {
				case 1: 
					// Vacina
					vacina.getMenuVacina();
					op = 1;
				break;
				case 2: 
					// Local
					localVacina.getMenuLocal();
					op = 1;
				break;
				case 3:
					// Enfermeiros
					op = 1;
				break;
				case 4:
					// Pessoas
					pessoa.getMenuPessoa();
					op = 1;
				break;
				
				default:
					System.out.println("Obrigado por ultilizar nosso sistema!");
				break;	
			}
		}
		
		in.close();
		
		
	}

}
