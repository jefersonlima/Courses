package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Interfaces.Menu;
import Vacina.Vacina;

public class MenuVacina implements Menu{
	Scanner in = new Scanner(System.in);
	
	List<Vacina> listVacina = new ArrayList<Vacina>();

	public boolean isVacina(){
        return listVacina.size() != 0 ? true : false;
    }
	
	@Override
	public void getMenu() {
		int op = 1;
		while(op != 0) {
			System.out.println(
					  "##################### VACINA #####################\n"
					+ "##### Selecione uma opcao:                   #####\n"
					+ "##### 1 - Cadastrar nova Vacina              #####\n"
					+ "##### 2 - Consultar uma Vacina               #####\n"
					+ "##### 3 - Listar Todas Vacinas Cadastradas   #####\n"
					+ "##### 4 - Alterar uma Vacina                 #####\n"
					+ "##### 5 - Deletar uma Vacina                 #####\n"
					+ "##### 0 - Voltar                             #####\n"
					+ "##################################################"
			);
			 op = in.nextInt();
			switch(op) {
				case 1: 
					// Cadastrar
					System.out.println("################ Cadastrar Vacinas ###############");
					cadastrar();
					System.out.println("##################################################\n");
				break;
				case 2: 
					// Consultar
					System.out.println("################ Consultar Vacinas ###############");
					consultar();
					System.out.println("##################################################\n");
				break;
				case 3: 
					// Listar
					System.out.println("################# Listar Vacinas #################");
					listagem();
					System.out.println("##################################################\n");
				break;
				case 4:
					// Alterar
					System.out.println("################# Alterar Vacina #################");
					alterar();
					System.out.println("##################################################\n");
				break;
				case 5:
					// Deletar
					System.out.println("################# Deletar Vacinas ################");
					deletar();
					System.out.println("##################################################\n");
				break;
				case 99:
					popular();
				break;
				default:
				break;
			}	
		}
	}

	@Override
	public void cadastrar() {
		String nomeVacina; 
		String fabricante;
		Integer duracao; 
		Integer idadeMinima; 
		Integer dose; 
		Integer eficacia;
		String restricoes;
		
		System.out.println("Cadastrar Vacina:\n");
		
		System.out.println("Informe o Nome da Vacina:");
		in.nextLine();
		nomeVacina = in.nextLine();	
		
		System.out.println("Informe o Nome da fabricante:");
		fabricante = in.nextLine();
		
		System.out.println("Informe duracao da Vacina:");
		duracao = in.nextInt();
		
		System.out.println("Informe a idade Minima para tomar a Vacina:");
		idadeMinima = in.nextInt();
		
		System.out.println("Informe a quantidade de doses:");
		dose = in.nextInt();
		
		System.out.println("Informe a eficacia da Vacina:");
		eficacia = in.nextInt();
		in.nextLine();
		
		System.out.println("Informe as restricoes da Vacina:");
		restricoes = in.nextLine();
		
		if(nomeVacina != null && fabricante != null && duracao != null && idadeMinima != null && dose != null && eficacia != null && restricoes != null) {
			listVacina.add( new Vacina(nomeVacina, fabricante, duracao, idadeMinima, dose, eficacia, restricoes));
			System.out.println("Vacina Cadastrada!\n");
		}else{
			System.out.println("Vacina nao Cadastrada!\n");
		}	
	}

	@Override
	public void consultar() {
		if(listVacina.size() == 0){
			System.out.println("Nao Existe Vacina cadastrada para Consultar!");
			return;
		}
		System.out.println("##### Qual o Nome da Vacina que deseja Consultar? #####");
		System.out.println("############### Informe o Nome da Vacina! #############");
				
		String nomeVacina = in.next();
		for (Vacina v : listVacina) {
			if(v.getNomeVacina().toUpperCase().equals(nomeVacina.toUpperCase())){
				System.out.println(v.toString());
			}
		}
	}

	@Override
	public void listagem() {
		if(listVacina.size() == 0){
			System.out.println("Nao Existe Vacina para Listar!");
			return;
		}
		for (Vacina v: listVacina) {
			System.out.println(v);
		}	
	}

	@Override
	public void alterar() {
		if (listVacina.size() == 0) {
			System.out.println("Nao Exitem Vacinas para alterar!");
			return;
		}
		int temVacina = 0;
		System.out.println("##### Qual o Nome da Vacina que deseja alterar? #####");
		listagem();
		System.out.println("############## Informe o Nome da Vacina! ##@@########");
				
		String nomeVacina = in.next();
		for (Vacina v : listVacina) {
			if(v.getNomeVacina().toUpperCase().equals(nomeVacina.toUpperCase())){
				temVacina = 1;
				System.out.println(v.getNomeVacina());
				int op = 1;
				
				while(op != 0){
						System.out.println("################# Seleciona o que deseja alterar! #################\n"
						+"##### 1 - Nome Vacina:                                   ##########\n"                                
						+"##### 2 - Fabricante:                                    ##########\n"
						+"##### 3 - Duracao:                                       ##########\n"
						+"##### 4 - Idade Minima:                                  ##########\n"
						+"##### 5 - Quantidade de doses:                           ##########\n"
						+"##### 6 - Eficacia:                                      ##########\n"
						+"##### 7 - Restricoes:                                    ##########\n"
						+"##### 0 - Sair                                           ##########\n"
						+"###################################################################\n");
					op = in.nextInt();
					in.nextLine();
					
					switch(op){
						case 1:
							System.out.println("\nInforme o Novo nome da Vacina " + v.getNomeVacina());
							v.setNomeVacina(in.nextLine().toUpperCase());
							System.out.println("Nome alterado para: " + v.getNomeVacina()+"\n");
						break;
						case 2:
							System.out.println("\nInforme o Novo Fabricante da Vacina " + v.getNomeVacina());
							v.setFabricante(in.nextLine().toUpperCase());
							System.out.println("Fabricante alterado para: " + v.getFabricante()+"\n");
						break;
						case 3:
							System.out.println("\nInforme a Nova Duracao da Vacina " + v.getNomeVacina());
							v.setDuracao(in.nextInt());
							System.out.println("Duracao alterado para: " + v.getDuracao()+" Meses\n");
						break;
						case 4:
							System.out.println("\nInforme a Nova Idade Minima da Vacina " + v.getNomeVacina());
							v.setIdadeMinima(in.nextInt());
							System.out.println("Idade Minima foi alterada para: " + v.getIdadeMinima()+" Anos\n");
						break;
						case 5:
							System.out.println("\nInforme Nova Quantidade de doses da Vacina " + v.getNomeVacina());
							v.setDose(in.nextInt());
							System.out.println("Quantidade de doses foi alterada para: " + v.getDose()+" Dose(s)\n");
						break;
						case 6:
							System.out.println("\nInforme Porcentagem de Eficacia da Vacina " + v.getNomeVacina());
							v.setEficacia(in.nextInt());
							System.out.println("Eficacia da Vacina foi alterada para: " + v.getEficacia() + "%\n");
						break;
						case 7:
							System.out.println("\nInforme a Nova Restricao da Vacina " + v.getNomeVacina());
							v.setRestricoes(in.nextLine());
							System.out.println("Restricao foi alterada para: " + v.getRestricoes()+"\n");
						break;
						case 0:

						break;
						default:
							System.out.println("Opcao Invalida!");
						break;
					}
				}
			}
		}
		if (temVacina == 0) {
			System.out.println("Vacina Invalida!\n");
		}
	}

	@Override
	public void deletar() {
		if(listVacina.size() == 0){
			System.out.println("Nao Existe Vacina para deletar!");
			return;
		}
		int quantidadeDeletada = listVacina.size();
		System.out.println("##### Informe o Nome da Vacina para deletar! #####");
		String nomeVacina = in.next();
		for (Vacina v : listVacina) {
			if(v.getNomeVacina().toUpperCase().equals(nomeVacina.toUpperCase())){
				listVacina.remove(v);
				System.out.println("##### Vacina deletada! #####");
				break;
			}
		}
		if (quantidadeDeletada == listVacina.size()) {
			System.out.println("##### Vacina nao encontrada! #####");
		}	
	}

	@Override
	public void popular() {
		listVacina.add( new Vacina("CORONAVAC", "CHINA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("ASTRAZENECA", "fabricante", 1, 18, 2, 67, "restricoes"));
		listVacina.add( new Vacina("COVAXIN", "Bharat Biotech", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("SPUTNIK V", "RUSSIA", 1, 18, 2, 92, "restricoes"));
		listVacina.add( new Vacina("OXFORD", "Universidade de Oxford", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("MODERNA", "EUA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("PFIZER", "Estados Unidos e Alemanha", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("SINOPHARM", "CHINA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("CANSINO", "CHINA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("JANSSEN", "Johnson", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("NOVAVAX", "EUA", 1, 18, 2, 57, "restricoes"));
	}
}