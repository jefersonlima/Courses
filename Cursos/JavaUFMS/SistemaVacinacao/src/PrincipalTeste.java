import CarteiraVacinacao.CarteiraVacina;
import Endereco.Endereco;
import Funcionario.Funcionario;
import LocalVacinacao.LocalVacinacao;
import Pessoa.Pessoa;
import Prioridade.Prioridade;
import Vacina.Vacina;

public class PrincipalTeste {

	public static void main(String[] args) {
		 Endereco endereco1 = new Endereco("rua", 0, "bairro", "cidade", "cep");
		 Endereco endereco2 = new Endereco("rua", 0, "bairro", "cidade");
		 
		 System.out.println(endereco1.toString());
		 System.out.println(endereco2.toString());
		 
		 //INSTANCIAS DAS VACINAS
		 Vacina vacina1 = new Vacina("CORONAVAC", "CHINA", 1, 18, 2, 57, "restricoes");
		 Vacina vacina2 = new Vacina("ASTRAZENECA", "fabricante", 1, 18, 2, 57, "restricoes");
		 Vacina vacina3 = new Vacina("Covaxin", "Bharat Biotech", 1, 18, 2, 57, "restricoes");
		 Vacina vacina4 = new Vacina("Sputnik V", "RUSSIA", 1, 18, 2, 92, "restricoes");
		 Vacina vacina5 = new Vacina("Vacina de Oxford", "Universidade de Oxford", 1, 18, 2, 57, "restricoes");
		 Vacina vacina6 = new Vacina("Moderna", "EUA", 1, 18, 2, 57, "restricoes");
		 Vacina vacina7 = new Vacina("Vacina da Pfizer", "Estados Unidos e Alemanha", 1, 18, 2, 57, "restricoes");
		 Vacina vacina8 = new Vacina("Sinopharm", "CHINA", 1, 18, 2, 57, "restricoes");
		 Vacina vacina9 = new Vacina("CanSino", "CHINA", 1, 18, 2, 57, "restricoes");
		 Vacina vacina10 = new Vacina("Johnson", "EUA", 1, 18, 2, 57, "restricoes");
		 Vacina vacina11 = new Vacina("Novavax", "EUA", 1, 18, 2, 57, "restricoes");
		 Vacina vacina12 = new Vacina("CanSino", "CHINA", 1, 18, 2, 57, "restricoes");
		 
		 System.out.println(vacina1.toString());
		 System.out.println(vacina1.compareTo());
		 
		 //INSTANCIAS DOS LOCAIS
		 LocalVacinacao localVacinacao1 = new LocalVacinacao("DRIVE-THRU AYRTON SENNA", endereco1);
		 LocalVacinacao localVacinacao2 = new LocalVacinacao("DRIVE-THRU ALBANO FRANCO", endereco1);
		 LocalVacinacao localVacinacao3 = new LocalVacinacao("DRIVE-THRU CASSEMS", endereco1);
		 LocalVacinacao localVacinacao4 = new LocalVacinacao("GUANANDIZÃO", endereco1);
		 LocalVacinacao localVacinacao5 = new LocalVacinacao("SELETA", endereco1);
		 LocalVacinacao localVacinacao6 = new LocalVacinacao("IMPCG", endereco1);
		 LocalVacinacao localVacinacao7 = new LocalVacinacao("USF Noroeste", endereco1);
		 LocalVacinacao localVacinacao8 = new LocalVacinacao("USF Nova Bahia", endereco1);
		 LocalVacinacao localVacinacao9 = new LocalVacinacao("USF Mata do Jacinto", endereco1);
		 LocalVacinacao localVacinacao10 = new LocalVacinacao("USB Butiti", endereco1);
		 LocalVacinacao localVacinacao11 = new LocalVacinacao("USF Batistão", endereco1);
		 LocalVacinacao localVacinacao12 = new LocalVacinacao("USF Coophavila", endereco1);
		 LocalVacinacao localVacinacao13 = new LocalVacinacao("UBS Cel. Antonino", endereco1);
		 LocalVacinacao localVacinacao14 = new LocalVacinacao("USF São Francisco", endereco1);
		 LocalVacinacao localVacinacao15 = new LocalVacinacao("USF Vila Nasser", endereco1);
		 LocalVacinacao localVacinacao16 = new LocalVacinacao("USF Moreninha", endereco1);
		 LocalVacinacao localVacinacao17 = new LocalVacinacao("USF Itamaracá", endereco1);
		 LocalVacinacao localVacinacao18 = new LocalVacinacao("UBS Universitário", endereco1);
		 LocalVacinacao localVacinacao19 = new LocalVacinacao("UBS Lar do Trabalhador", endereco1);
		 LocalVacinacao localVacinacao20 = new LocalVacinacao("USF Albino Coimbra", endereco1);
		 LocalVacinacao localVacinacao21 = new LocalVacinacao("UBS Silia Regina", endereco1);
		 LocalVacinacao localVacinacao22 = new LocalVacinacao("UBS Jockey Club", endereco1);
		 LocalVacinacao localVacinacao23 = new LocalVacinacao("UBS Dona Neta", endereco1);
		 LocalVacinacao localVacinacao24 = new LocalVacinacao("C.F Iracy Coelho", endereco1);
		 LocalVacinacao localVacinacao25 = new LocalVacinacao("USF Los Angeles", endereco1);
		 
		 System.out.println(localVacinacao1.toString());	
		 
		 Pessoa pessoa1 = new Pessoa("nome", 65, 'M', "cpf", "celular", 0, endereco1, "Professor", false, "Indíngena", false);
		 System.out.println(pessoa1.toString());
		 
		 
		 
		 Funcionario funcionario1 = new Funcionario("nome", 38, 'M', "cpf", "celular", 0, endereco1, "profissao", false, "raca", false);
		 System.out.println(funcionario1.toString());
		 
		 CarteiraVacina carteiraVacinacao = new CarteiraVacina(localVacinacao1, pessoa1, funcionario1, vacina1);
		 System.out.println(carteiraVacinacao.toString());
		 
		 //Verificar como colocar isso no Construtor
		 System.out.println("Prioridade: " + Prioridade.verificaPrioridade(pessoa1));
		 
		 System.out.println(pessoa1.validarCPF("00409163163")); //Colocar sem simbolos
	}

}
