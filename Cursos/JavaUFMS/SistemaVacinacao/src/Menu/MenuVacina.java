package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Endereco.Endereco;
import Pessoa.Pessoa;
import Vacina.Vacina;

public class MenuVacina{
	Scanner in = new Scanner(System.in);
	
	List<Vacina> listVacina = new ArrayList<Vacina>();
	
	public void getMenuVacina() {
		int op = 1;
		while(op != 0) {
			System.out.println(
					"Selecione uma op��o:\n"
					+ "1 - Cadastrar nova Vacina\n"
					+ "2 - Listar Todas Vacinas Cadastradas \n"
					+ "3 - Alterar uma Vacina\n"
					+ "4 - Deletar uma Vacina\n"
					+ "0 - Voltar"
			);
			 op = in.nextInt();
			switch(op) {
				case 1: 
					// Cadastrar
					System.out.println("----- Cadastrar Vacinas -----");
					CadastrarVacina();
					System.out.println("---------------");
				break;
				case 2: 
					// Listar
					System.out.println("----- Listar Vacinas -----");
					ListarVacinas();
					System.out.println("---------------");
				break;
				case 3:
					// Alterar
					System.out.println("----- Alterar Vacinas -----");
					AlterarVacina();
					System.out.println("---------------");
				break;
				case 4:
					// Deletar
					System.out.println("----- Deletar Vacinas -----");
					deletarVacina();
					System.out.println("---------------");
				break;
				case 99:
					populaVacinas();
				break;
				default:
				break;
			}	
		}
	}
	
	private void populaVacinas() {
		listVacina.add( new Vacina("CORONAVAC", "CHINA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("ASTRAZENECA", "fabricante", 1, 18, 2, 67, "restricoes"));
		listVacina.add( new Vacina("Covaxin", "Bharat Biotech", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("Sputnik V", "RUSSIA", 1, 18, 2, 92, "restricoes"));
		listVacina.add( new Vacina("Vacina de Oxford", "Universidade de Oxford", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("Moderna", "EUA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("Vacina da Pfizer", "Estados Unidos e Alemanha", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("Sinopharm", "CHINA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("CanSino", "CHINA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("Johnson", "EUA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("Novavax", "EUA", 1, 18, 2, 57, "restricoes"));
		listVacina.add( new Vacina("CanSino", "CHINA", 1, 18, 2, 57, "restricoes"));
	}
	
	private void CadastrarVacina() {
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
		
		System.out.println("Informe a efic�cia da Vacina:");
		eficacia = in.nextInt();
		in.nextLine();
		
		System.out.println("Informe as restricoes da Vacina:");
		restricoes = in.nextLine();
		
		if(nomeVacina != null && fabricante != null && duracao != null && idadeMinima != null && dose != null && eficacia != null && restricoes != null) {
			listVacina.add( new Vacina(nomeVacina, fabricante, duracao, idadeMinima, dose, eficacia, restricoes));
			System.out.println("Vacina Cadastrada!\n");
		}else{
			System.out.println("Vacina n�o Cadastrada!\n");
		}
	}
	public void ListarVacinas() {
		if(listVacina.size() == 0){
			System.out.println("N�o Existe Vacina para Listar!");
			return;
		}
		for (Vacina v: listVacina) {
			System.out.println(v);
		}
	}
	
	private void  AlterarVacina(){
		if (listVacina.size() == 0) {
			System.out.println("N�o Exitem Vacinas para alterar!");
			return;
		}
		int temVacina = 0;
		System.out.println("----- Qual o Nome da Vacina que deseja alterar? -----");
		ListarVacinas();
		System.out.println("----- Informe o Nome da Vacina! -----");
				
		String nomeVacina = in.next();
		for (Vacina v : listVacina) {
			if(v.getNomeVacina().equals(nomeVacina.toUpperCase())){
				temVacina = 1;
				System.out.println(v.getNomeVacina());
				int op = 1;
				
				while(op != 0){
					System.out.println("Seleciona o que deseja alterar!\n"
						+"1 - Nome Vacina:\n"
						+"2 - Fabricante:\n"
						+"3 - Duracao:\n"
						+"4 - Idade Minima:\n"
						+"5 - Quantidade de doses:\n"
						+"6 - Efic�cia:\n"
						+"7 - Restricoes:\n"
						+"0 - Sair");
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
							System.out.println("\nInforme a Nova Dura��o da Vacina " + v.getNomeVacina());
							v.setDuracao(in.nextInt());
							System.out.println("Dura��o alterado para: " + v.getDuracao()+" Meses\n");
						break;
						case 4:
							System.out.println("\nInforme a Nova Idade M�nima da Vacina " + v.getNomeVacina());
							v.setIdadeMinima(in.nextInt());
							System.out.println("Idade M�nima foi alterada para: " + v.getIdadeMinima()+" Anos\n");
						break;
						case 5:
							System.out.println("\nInforme Nova Quantidade de doses da Vacina " + v.getNomeVacina());
							v.setDose(in.nextInt());
							System.out.println("Quantidade de doses foi alterada para: " + v.getDose()+" Dose(s)\n");
						break;
						case 6:
							System.out.println("\nInforme Porcentagem de Efic�cia da Vacina " + v.getNomeVacina());
							v.setEficacia(in.nextInt());
							System.out.println("Efic�cia da Vacina foi alterada para: " + v.getEficacia() + "%\n");
						break;
						case 7:
							System.out.println("\nInforme a Nova Restri��o da Vacina " + v.getNomeVacina());
							v.setRestricoes(in.nextLine());
							System.out.println("Restri��o foi alterada para: " + v.getRestricoes()+"\n");
						break;
						case 0:

						break;
						default:
							System.out.println("Op��o Inv�lida!");
						break;
					}
				}
			}
		}
		if (temVacina == 0) {
			System.out.println("Vacina Inv�lida!\n");
		}
	}
	
	private void deletarVacina() {
		if(listVacina.size() == 0){
			System.out.println("N�o Existe Vacina para deletar!");
			return;
		}
		int quantidadeDeletada = listVacina.size();
		System.out.println("----- Informe o Nome da Vacina para deletar! -----");
		String nomeVacina = in.next();
		for (Vacina v : listVacina) {
			if(v.getNomeVacina().equals(nomeVacina.toUpperCase())){
				listVacina.remove(v);
				System.out.println("----- Vacina deletada! -----");
				break;
			}
		}
		if (quantidadeDeletada == listVacina.size()) {
			System.out.println("----- Vacina n�o encontrada! -----");
		}
	}
}