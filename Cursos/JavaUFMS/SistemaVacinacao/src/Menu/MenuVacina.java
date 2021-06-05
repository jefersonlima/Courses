package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Vacina.Vacina;

public class MenuVacina{
	Scanner in = new Scanner(System.in);
	
	List<Vacina> vacina = new ArrayList<Vacina>();
	public void getMenuVacina(int op) {
		switch(op) {
			case 1: 
				// Cadastrar
				System.out.println("Cadastrar");
				CadastrarVacina();
			break;
			case 2: 
				// Listar
				System.out.println("Listar");
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
	
	private void CadastrarVacina() {
		String nomeVacina; 
		String fabricante;
		Integer duracao; 
		Integer idadeMinima; 
		Integer dose; 
		Integer eficacia;
		String restricoes;
		
		System.out.println("Cadastrar Vacina");
		
		System.out.println("Informe o Nome da Vacina");
		nomeVacina = in.nextLine();
		
		System.out.println("Informe o Nome da fabricante");
		fabricante = in.nextLine();
		
		System.out.println("Informe duracao da Vacina");
		duracao = in.nextInt();
		
		System.out.println("Informe a idade Minima para tomar a Vacina");
		idadeMinima = in.nextInt();
		
		System.out.println("Informe a quantidade de doses");
		dose = in.nextInt();
		
		System.out.println("Informe a eficáciao da Vacina");
		eficacia = in.nextInt();
		
		System.out.println("Informe as restricoes da Vacina");
		restricoes = in.nextLine();
		
		vacina.add( new Vacina(nomeVacina, fabricante, duracao, idadeMinima, dose, eficacia, restricoes));
		
	}
	public void ListarVacinas() {
		for (Vacina v: vacina) {
			System.out.println(v);
		}
	}
	
}
