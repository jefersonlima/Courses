package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CarteiraVacinacao.CarteiraVacina;
import Funcionario.Funcionario;
import Interfaces.Menu;
import LocalVacinacao.LocalVacinacao;
import Pessoa.Pessoa;
import Vacina.Vacina;
import Endereco.Endereco;
import Funcionario.Funcionario;

public class MenuVacinar implements Menu{
    Scanner in = new Scanner(System.in);
    List<CarteiraVacina> listaVacinar = new ArrayList<CarteiraVacina>();
	MenuVacina menuVacina;
	MenuPessoa menuPessoa;
	MenuLocal menuLocalVacina;
	MenuFuncionario menuFuncionario;

	public boolean isListEmpty(){
		if(listaVacinar.size() == 0){
			System.out.println("#####         Não a items na lista!          #####");
			return true;
		}
		return false;
	}

	public void setMenuAll(MenuVacina vacina,MenuPessoa pessoa,MenuLocal localVacina,MenuFuncionario funcionario){
		menuVacina = vacina;
		menuPessoa = pessoa;
		menuLocalVacina = localVacina;
		menuFuncionario = funcionario;
	}
	
    @Override
	public void getMenu() {
    	int op = 1;
        while(op != 0){
            System.out.println(
                "###################CARTEIRAVACINA##################\n"
                +"##### Selecione as acoes abaixo!             #####\n"
                +"##### 1 - Cadastrar Carteira de Vacinacao    #####\n"
                +"##### 2 - Listar                             #####\n"
                +"##### 0 - Voltar                             #####\n"
                +"##################################################"
				);
            op = in.nextInt();
			in.nextLine();
            switch(op){
                case 1: 
					// Cadastrar
					System.out.println(
						"##################################################\n"
                        +"#####    Cadastrar                           #####"
					);
					cadastrar();
				break;
				case 2: 
					// Listar
					System.out.println(
						"##################################################\n"
                        +"#####    Listar                              #####"
						);
					listagem();
				break;
                case 99:
                    popular();
                break;
                default:
                    System.out.println("Opcao invalida!");
                break;
            }
        }
	}
	@Override
	public void cadastrar() {
		LocalVacinacao localvacinacao;
		Pessoa pessoa;
		Funcionario funcionario;
		Vacina vacina;
		int indexLocalVacina  = menuLocalVacina.listaLocalVacina.size();
		int indexPessoa = menuPessoa.listPessoa.size();
		int indexFuncionario = menuFuncionario.listFuncionario.size();
		int indexVacina = menuVacina.listVacina.size();

		// Local Vacinacao
		menuLocalVacina.cadastrar();
		// Pessoa
		menuPessoa.cadastrar();
		// Funcionario
		menuFuncionario.cadastrar();
		// Vacina
		menuVacina.cadastrar();
		


		CarteiraVacina carteira;
		
		carteira = new CarteiraVacina(
			menuLocalVacina.listaLocalVacina.get(indexLocalVacina + 1),
			menuPessoa.listPessoa.get(indexPessoa + 1),
			menuFuncionario.listFuncionario.get(indexFuncionario+1),
			menuVacina.listVacina.get(indexVacina +1)
		);

		listaVacinar.add(carteira);
	}
	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listagem() {
		if(isListEmpty()){
			return;
		}
        for (CarteiraVacina cv: listaVacinar) {
			System.out.println(cv);
		}
		
	}
	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void popular() {
		// Endereços
		// listEndereco.add( new Endereco("Rua Ayrton Senna", 114, "Belo Jardim II", "Rio Branco","69908032"));
		// listEndereco.add( new Endereco("Rua Via Firenze", 192, "Jardim Vila Paradiso", "Indaiatuba","13331563"));
		// listEndereco.add( new Endereco("Servidao Nove de Novembro", 945, "Retiro", "Volta Redonda","27277212"));
		// listEndereco.add( new Endereco("Rua Quatro", 772, "Quintas Coloniais", "Contagem","32044480"));

		// // Local de Vacina
		// listaLocalVacina.add(new LocalVacinacao("Rua da Paz", listEndereco.get(0)));
        // listaLocalVacina.add(new LocalVacinacao("Centro", listEndereco.get(1)));
        // listaLocalVacina.add(new LocalVacinacao("Aero Racho", listEndereco.get(2)));
        // listaLocalVacina.add(new LocalVacinacao("Itamaraca", listEndereco.get(3)));

		// // Vacina
		// listVacina.add( new Vacina("CORONAVAC", "CHINA", 1, 18, 2, 57, "restricoes"));
		// listVacina.add( new Vacina("ASTRAZENECA", "fabricante", 1, 18, 2, 67, "restricoes"));
		// listVacina.add( new Vacina("COVAXIN", "Bharat Biotech", 1, 18, 2, 57, "restricoes"));
		// listVacina.add( new Vacina("SPUTNIK V", "RUSSIA", 1, 18, 2, 92, "restricoes"));
		// listVacina.add( new Vacina("OXFORD", "Universidade de Oxford", 1, 18, 2, 57, "restricoes"));
		// listVacina.add( new Vacina("MODERNA", "EUA", 1, 18, 2, 57, "restricoes"));
		// listVacina.add( new Vacina("PFIZER", "Estados Unidos e Alemanha", 1, 18, 2, 57, "restricoes"));
		// listVacina.add( new Vacina("SINOPHARM", "CHINA", 1, 18, 2, 57, "restricoes"));
		// listVacina.add( new Vacina("CANSINO", "CHINA", 1, 18, 2, 57, "restricoes"));
		// listVacina.add( new Vacina("JANSSEN", "Johnson", 1, 18, 2, 57, "restricoes"));
		// listVacina.add( new Vacina("NOVAVAX", "EUA", 1, 18, 2, 57, "restricoes"));

		// // Pessoa
		// listPessoa.add(new Pessoa("Gilson Jose do Santos", 26, 'M', "87025384828", "(67) 99459-3797", listEndereco.get(0), "Designer", false, "Pardo", false));
		// listPessoa.add(new Pessoa("Jeferson", 65, 'M', "70429878109", "(83) 99940-1105", listEndereco.get(1), "Professor", false, "Preto", false));
		// listPessoa.add(new Pessoa("Henrique Theo Guilherme Rezende", 65, 'M', "54058291451", "(68)99164-9104", listEndereco.get(2), "Professor", true, "Branco", false));
		// listPessoa.add(new Pessoa("Isadora", 50, 'F', "45457869369", "(62) 98528-9986", listEndereco.get(3), "Professor", false, "Parda", true));

		// // Funcionario
		// listFuncionario.add(new Funcionario("Gilson Jose do Santos", 26, 'M', "87025384828", "(67) 99459-3797", listEndereco.get(0), "Designer", false, "Pardo", false, 0));
		// listFuncionario.add(new Funcionario("Jeferson", 65, 'M', "98765432100", "(83) 99940-1105", listEndereco.get(1), "Professor", false, "Preto", false, 1));
		// listFuncionario.add(new Funcionario("Henrique Theo Guilherme Rezende", 65, 'M', "54058291451", "(68)99164-9104", listEndereco.get(2), "Professor", true, "Branco", false, 2));
		// listFuncionario.add(new Funcionario("Isadora", 50, 'F', "45457869369", "(62) 98528-9986", listEndereco.get(3), "Professor", false, "Parda", true, 3));

        listaVacinar.add(new CarteiraVacina(menuLocalVacina.listaLocalVacina.get(0),menuPessoa.listPessoa.get(0),menuFuncionario.listFuncionario.get(0),menuVacina.listVacina.get(0)));
        listaVacinar.add(new CarteiraVacina(menuLocalVacina.listaLocalVacina.get(1),menuPessoa.listPessoa.get(1),menuFuncionario.listFuncionario.get(1),menuVacina.listVacina.get(1)));
        listaVacinar.add(new CarteiraVacina(menuLocalVacina.listaLocalVacina.get(2),menuPessoa.listPessoa.get(2),menuFuncionario.listFuncionario.get(2),menuVacina.listVacina.get(2)));
        listaVacinar.add(new CarteiraVacina(menuLocalVacina.listaLocalVacina.get(3),menuPessoa.listPessoa.get(3),menuFuncionario.listFuncionario.get(3),menuVacina.listVacina.get(3)));

        System.out.println("#####    Itens cadastrados "+listaVacinar.size()+"                 #####");
	}

 
}
