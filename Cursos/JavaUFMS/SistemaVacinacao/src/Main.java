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
			String listVacina = localVacina.isLocalVacina() ? "##### 5 - Listar vacinas                     #####\n" : "";
			String listLocal = localVacina.isLocalVacina() ? "##### 6 - Listar local de vacinas            #####\n" : "";
			String listEnfermeiro = localVacina.isLocalVacina() ? "##### 7 - Listar enfermeiros                 #####\n" : "";
			String listPessoa = pessoa.isPessoa() ? "##### 8 - Listar pessoas                     #####\n" : "";

			System.out.println(
				"##################################################\n"
				+"##### Bem-vindo ao sistema de vacina!        #####\n"
				+"##### Selecione uma opção:                   #####\n"
				+"##### 1 - Vacina                             #####\n"
				+"##### 2 - Local                              #####\n"
				+"##### 3 - Enfermeiros                        #####\n"
				+"##### 4 - Pessoas                            #####\n"
				+listVacina
				+listLocal
				+listEnfermeiro
				+listPessoa
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
				case 5:
					if(localVacina.isLocalVacina()){
						localVacina.listagem();
					}else{
						System.out.println("Opção inválida!");
					}
				break;
				case 6:
					if(pessoa.isPessoa()){
						pessoa.listagem();
					}else{
						System.out.println("Opção inválida!");
					}
				break;
				case 7:
					if(pessoa.isPessoa()){
						pessoa.listagem();
					}else{
						System.out.println("Opção inválida!");
					}
				break;
				case 8:
					if(pessoa.isPessoa()){
						pessoa.listagem();
					}else{
						System.out.println("Opção inválida!");
					}
				break;
				default:
					System.out.println("Opção inválida!111");
				break;
			}
		}
		in.close();
 	}

}