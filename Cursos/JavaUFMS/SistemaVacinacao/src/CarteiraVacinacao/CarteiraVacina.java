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

	@Override
	public String toString() {
		return "\nCarteiraVacina:" + "\nlocal da vacinacao: " + localvacinacao.getNomeLocal() + "\npessoa Vacinada: "
				+ pessoa.getNome() + "\nfuncionario responsavel pela vacinacao: " + funcionario.getNome()
				+ "\nnome da vacina usada: " + vacina.getNomeVacina() + "\n";
	}
}
