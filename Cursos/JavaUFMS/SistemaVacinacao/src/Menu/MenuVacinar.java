package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import CarteiraVacinacao.CarteiraVacina;
import Funcionario.Funcionario;
import Interfaces.Menu;
import LocalVacinacao.LocalVacinacao;
import Pessoa.Pessoa;
import Vacina.Vacina;

public class MenuVacinar implements Menu{
    Scanner in = new Scanner(System.in);
    ArrayList<CarteiraVacina> vacinar = new ArrayList<CarteiraVacina>();
	
    
    @Override
	public void getMenu() {
    	cadastrar();
		
	}
	@Override
	public void cadastrar() {
		// Pegar o local
		
		// pegar a pessoa
		
		// pegar o funcionario
		
		// pegar a vacina

		
		//CarteiraVacina carteiraVacina = new CarteiraVacina(LocalVacinacao localvacinacao, Pessoa pessoa, Funcionario funcionario, Vacina vacina);
		//vacinar.add(carteiraVacina);
	}
	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listagem() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

 
}
