package CarteiraVacinacao;

import Funcionario.Funcionario;
import LocalVacinacao.LocalVacinacao;
import Menu.MenuFuncionario;
import Menu.MenuLocal;
import Menu.MenuPessoa;
import Menu.MenuVacina;
import Pessoa.Pessoa;
import Vacina.Vacina;

public class CarteiraVacina {
	LocalVacinacao localvacinacao;
	Pessoa pessoa;
	Funcionario funcionario;
	Vacina vacina;
	public CarteiraVacina(LocalVacinacao localvacinacao, Pessoa pessoa, Funcionario funcionario, Vacina vacina) {
		super();
		this.localvacinacao = localvacinacao;
		this.pessoa = pessoa;
		this.funcionario = funcionario;
		this.vacina = vacina;
	}
	public CarteiraVacina() {
		
	}
	public CarteiraVacina(MenuLocal localVacina, MenuPessoa pessoa2, MenuFuncionario menuFuncionario,
			MenuVacina vacina2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nCarteiraVacina:" + 
				"\nlocal vacinacao: " + localvacinacao + 
				"\npessoa: " + pessoa + 
				"\nfuncioanrio: " + funcionario + 
				"\nvacina: " + vacina;
	}
	
	

}
