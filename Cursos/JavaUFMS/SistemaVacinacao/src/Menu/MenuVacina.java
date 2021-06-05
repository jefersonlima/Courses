package Menu;

import Vacina.Vacina;

public class MenuVacina{

	public void getMenuVacina(int op) {
		switch(op) {
			case 1: 
				// Cadastrar
				System.out.println("Cadastrar");
				
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
}
