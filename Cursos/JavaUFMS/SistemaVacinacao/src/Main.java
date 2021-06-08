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
			String listVacina = vacina.isVacina() ? "##### 5 - Listar vacinas                     #####\n" : "";
			String listLocal = localVacina.isLocalVacina() ? "##### 6 - Listar local de vacinas            #####\n" : "";
			String listEnfermeiro = menuFuncionario.isFuncionario() ? "##### 7 - Listar enfermeiros                 #####\n" : "";
			String listPessoa = pessoa.isPessoa() ? "##### 8 - Listar pessoas                     #####\n" : "";

			System.out.println(
				"##################################################\n"
				+"##### Bem-vindo ao sistema de vacina!        #####\n"
				+"##### Selecione uma opcao:                   #####\n"
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
					vacina.getMenu();
				break;
				case 2: 
					// Local
					localVacina.getMenu();
				break;
				case 3:
					menuFuncionario.getMenu();
				break;
				case 4:
					// Pessoas
					pessoa.getMenu();
				break;
				case 5:
					if(vacina.isVacina()){
						vacina.listagem();
					}else{
						System.out.println("Opcao invalida!");
					}
				break;
				case 6:
					if(localVacina.isLocalVacina()){
						localVacina.listagem();
					}else{
						System.out.println("Opcao invalida!");
					}
				break;
				case 7:
					if(menuFuncionario.isFuncionario()){
						menuFuncionario.listagem();
					}else{
						System.out.println("Opcao invalida!");
					}
				break;
				case 8:
					if(pessoa.isPessoa()){
						pessoa.listagem();
					}else{
						System.out.println("Opcao invalida!");
					}
				break;
				default:
					System.out.println("Opcao invalida!");
				break;
			}
		}
		in.close();
 	}

}