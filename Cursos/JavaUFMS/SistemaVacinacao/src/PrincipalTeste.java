import CarteiraVacinacao.CarteiraVacina;
import Endereco.Endereco;
import Funcionario.Funcionario;
import LocalVacinacao.LocalVacinacao;
import Pessoa.Pessoa;
import Vacina.Vacina;

public class PrincipalTeste {

	public static void main(String[] args) {
		 Endereco endereco1 = new Endereco("rua", 0, "bairro", "cidade", "cep");
		 Endereco endereco2 = new Endereco("rua", 0, "bairro", "cidade");
		 
		 System.out.println(endereco1.toString());
		 System.out.println(endereco2.toString());
		 
		 Vacina vacina1 = new Vacina("nomeVacina", "fabricante", 1, 18, 2, 57, "restricoes");
		 System.out.println(vacina1.toString());
		 System.out.println(vacina1.compareTo());
		 
		 LocalVacinacao localVacinacao = new LocalVacinacao("nomeLocal", endereco1);
		 System.out.println(localVacinacao.toString());	
		 
		 Pessoa pessoa1 = new Pessoa("nome", 38, 'M', "cpf", "celular", 0, endereco1, "profissao", false, "raca", false);
		 System.out.println(pessoa1.toString());
		 
		 Funcionario funcionario1 = new Funcionario("nome", 38, 'M', "cpf", "celular", 0, endereco1, "profissao", false, "raca", false);
		 System.out.println(funcionario1.toString());
		 
		 CarteiraVacina carteiraVacinacao = new CarteiraVacina(localVacinacao, pessoa1, funcionario1, vacina1);
		 System.out.println(carteiraVacinacao.toString());

	}

}
