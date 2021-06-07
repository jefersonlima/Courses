//Lib
import java.util.Scanner;

import Menu.MenuPessoa;
import Menu.MenuVacina;
import Menu.MenuFuncionario;
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
		MenuFuncionario menuFuncionario = new MenuFuncionario();
		int op = 1;
		while(op != 0){
			System.out.println(
				"##################################################\n"
				+"##### Bem-vindo ao sistema de vacina!        #####\n"
				+"##### Selecione uma opção:                   #####\n"
				+"##### 1 - Vacina                             #####\n"
				+"##### 2 - Local                              #####\n"
				+"##### 3 - Enfermeiros                        #####\n"
				+"##### 4 - Pessoas                            #####\n"
				+"##### 0 - Sair                               #####\n"
				+"##################################################"
			);
			
			op = in.nextInt();

			switch(op) {
				case 1:
					// Vacina
					vacina.getMenuVacina();
				break;
				case 2: 
					// Local
					localVacina.getMenu();
				break;
				case 3:
					menuFuncionario.getMenuFuncionario();
				break;
				case 4:
					// Pessoas
					pessoa.getMenu();
				break;
				default:
					System.out.println("Opção inválida!");
				break;
			}
		}
		in.close();
	}

}
