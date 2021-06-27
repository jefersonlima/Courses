//Lib
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CarteiraVacinacao.CarteiraVacina;
import Funcionario.Funcionario;
import LocalVacinacao.LocalVacinacao;
import Menu.MenuPessoa;
import Menu.MenuVacina;
import Menu.MenuVacinar;
import Pessoa.Pessoa;
import Vacina.Vacina;
import Menu.MenuFuncionario;
import Menu.MenuLocal;
// Import class
//import Pessoa.Pessoa;
//import Vacina.Vacina;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MenuVacina vacina = new MenuVacina();
		MenuPessoa pessoa = new MenuPessoa();
		MenuLocal localVacina = new MenuLocal();
		MenuFuncionario menuFuncionario = new MenuFuncionario();
		MenuVacinar vacinar = new MenuVacinar();

		int op = 1;
		while(op != 0){
			String listVacina = vacina.isVacina() ? "##### 6 - Listar vacinas                     #####\n" : "";
			String listLocal = localVacina.isLocalVacina() ? "##### 7 - Listar local de vacinas            #####\n" : "";
			String listEnfermeiro = menuFuncionario.isFuncionario() ? "##### 8 - Listar enfermeiros                 #####\n" : "";
			String listPessoa = pessoa.isPessoa() ? "##### 9 - Listar pessoas                     #####\n" : "";
			String listaCarteiraVacinar = vacina.isVacina() & localVacina.isLocalVacina() & menuFuncionario.isFuncionario() & pessoa.isPessoa() ? "##### 5 - Carteira de Vacinação              #####\n" : "";

			System.out.println(
				"##################################################\n"
				+"##### Bem-vindo ao sistema de vacina!        #####\n"
				+"##### Selecione uma opcao:                   #####\n"
				+"##### 1 - Vacina                             #####\n"
				+"##### 2 - Local                              #####\n"
				+"##### 3 - Enfermeiros                        #####\n"
				+"##### 4 - Pessoas                            #####\n"
				+listaCarteiraVacinar
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
				case 6:
					if(vacina.isVacina()){
						vacina.listagem();
					}else{
						System.out.println("Opcao invalida!");
					}
				break;
				case 5:
					if(!vacina.isVacina()){
						System.out.println("Por favor Cadastrar uma Vacina!");
					} else if(!localVacina.isLocalVacina()){
						System.out.println("Por favor Cadastrar um Local de Vacinacao!");
					} else if(!menuFuncionario.isFuncionario()){
						System.out.println("Por favor Cadastrar um Funcionario!");
					} else if(!pessoa.isPessoa()){
						System.out.println("Por favor Cadastrar uma Pessoa!");
					} else {
						vacinar.setMenuAll(vacina,pessoa,localVacina,menuFuncionario);
						vacinar.getMenu();
					}
				break;
				case 7:
					if(localVacina.isLocalVacina()){
						localVacina.listagem();
					}else{
						System.out.println("Opcao invalida!");
					}
				break;
				case 8:
					if(menuFuncionario.isFuncionario()){
						menuFuncionario.listagem();
					}else{
						System.out.println("Opcao invalida!");
					}
				break;
				case 9:
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