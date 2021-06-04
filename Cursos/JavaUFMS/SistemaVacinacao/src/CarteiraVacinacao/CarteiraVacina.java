package CarteiraVacinacao;

import Funcionario.Funcionario;
import LocalVacinacao.LocalVacinacao;
import Pessoa.Pessoa;
import Vacina.Vacina;

public class CarteiraVacina {
	LocalVacinacao localvacinacao;
	Pessoa pessoa;
	Funcionario funcioanrio;
	Vacina vacina;
	public CarteiraVacina(LocalVacinacao localvacinacao, Pessoa pessoa, Funcionario funcioanrio, Vacina vacina) {
		super();
		this.localvacinacao = localvacinacao;
		this.pessoa = pessoa;
		this.funcioanrio = funcioanrio;
		this.vacina = vacina;
	}
	@Override
	public String toString() {
		return "\nCarteiraVacina:" + 
				"\nlocal vacinacao: " + localvacinacao + 
				"\npessoa: " + pessoa + 
				"\nfuncioanrio: " + funcioanrio + 
				"\nvacina: " + vacina;
	}
	
	

}
