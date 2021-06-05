package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Vacina.Vacina;

public class MenuVacina{
	Scanner in = new Scanner(System.in);
	
	List<Vacina> vacina = new ArrayList<Vacina>();
	
	public void getMenuVacina() {
		int op = 1;
		while(op != 0) {
			System.out.println(
					"Selecione uma opção:\n"
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
					System.out.println("Cadastrar");
					CadastrarVacina();
				break;
				case 2: 
					// Listar
					System.out.println("Listar");
					ListarVacinas();
				break;
				case 3:
					// Alterar
					System.out.println("Alterar");
				break;
				case 4:
					// Deletar
					System.out.println("Deletar");
				break;
				default:
				break;
			}	
		}
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
		
		System.out.println("Informe a eficácia da Vacina:");
		eficacia = in.nextInt();
		in.nextLine();
		
		System.out.println("Informe as restricoes da Vacina:");
		restricoes = in.nextLine();
		
		if(nomeVacina != null && fabricante != null && duracao != null && idadeMinima != null && dose != null && eficacia != null && restricoes != null) {
			vacina.add( new Vacina(nomeVacina, fabricante, duracao, idadeMinima, dose, eficacia, restricoes));
			System.out.println("Vacina Cadastrada!\n");
		}else{
			System.out.println("Vacina não Cadastrada!\n");
		}
	}
	public void ListarVacinas() {
		for (Vacina v: vacina) {
			System.out.println(v);
		}
	}
}
