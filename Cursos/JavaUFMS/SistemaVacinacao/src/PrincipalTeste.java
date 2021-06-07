import java.util.ArrayList;
import java.util.List;

import CarteiraVacinacao.CarteiraVacina;
import Endereco.Endereco;
import Funcionario.Funcionario;
import LocalVacinacao.LocalVacinacao;
import Pessoa.Pessoa;
import Prioridade.Prioridade;
import Vacina.Vacina;

public class PrincipalTeste {

	public static void main(String[] args) {
		
		List<Endereco> endereco = new ArrayList<Endereco>();
//		endereco.add( new Endereco(1, "rua", 0, "bairro", "cidade", "cep"));
//		endereco.add( new Endereco(2, "rua", 0, "bairro", "cidade"));
		 
		for (Endereco e: endereco) {
			System.out.println(e);
		}
		 
		 //INSTANCIAS DAS VACINAS
//		List<Vacina> vacina = new ArrayList<Vacina>();
//		vacina.add( new Vacina(1, "CORONAVAC", "CHINA", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(2, "ASTRAZENECA", "fabricante", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(3, "Covaxin", "Bharat Biotech", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(4, "Sputnik V", "RUSSIA", 1, 18, 2, 92, "restricoes"));
//		vacina.add( new Vacina(5, "Vacina de Oxford", "Universidade de Oxford", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(6, "Moderna", "EUA", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(7, "Vacina da Pfizer", "Estados Unidos e Alemanha", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(8, "Sinopharm", "CHINA", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(9, "CanSino", "CHINA", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(10, "Johnson", "EUA", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(11, "Novavax", "EUA", 1, 18, 2, 57, "restricoes"));
//		vacina.add( new Vacina(12, "CanSino", "CHINA", 1, 18, 2, 57, "restricoes"));
		
		//imprime toda Lista Vacina
//		for (Vacina v: vacina) {
//			System.out.println(v);
//		}
		 
		 
		 //INSTANCIAS DOS LOCAIS
		List<LocalVacinacao> localVacinacao = new ArrayList<LocalVacinacao>();
//		 localVacinacao.add( new LocalVacinacao(1, "DRIVE-THRU AYRTON SENNA", binarySearch(endereco, codEndereco)));
//		 localVacinacao.add( new LocalVacinacao(2, "DRIVE-THRU ALBANO FRANCO", endereco));
//		 localVacinacao.add( new LocalVacinacao(3, "DRIVE-THRU CASSEMS", endereco));
//		 localVacinacao.add( new LocalVacinacao(4, "GUANANDIZÃO", endereco));
//		 localVacinacao.add( new LocalVacinacao(5, "SELETA", endereco1));
//		 localVacinacao.add( new LocalVacinacao(6, "IMPCG", endereco1));
//		 localVacinacao.add( new LocalVacinacao(7, "USF Noroeste", endereco1));
//		 localVacinacao.add( new LocalVacinacao(8, "USF Nova Bahia", endereco1));
//		 localVacinacao.add( new LocalVacinacao(9, "USF Mata do Jacinto", endereco1));
//		 localVacinacao.add( new LocalVacinacao(10, "USB Butiti", endereco1));
//		 localVacinacao.add( new LocalVacinacao(11, "USF Batistão", endereco1));
//		 localVacinacao.add( new LocalVacinacao(12, "USF Coophavila", endereco1));
//		 localVacinacao.add( new LocalVacinacao(13, "UBS Cel. Antonino", endereco1));
//		 localVacinacao.add( new LocalVacinacao(14, "USF São Francisco", endereco1));
//		 localVacinacao.add( new LocalVacinacao(15, "USF Vila Nasser", endereco1));
//		 localVacinacao.add( new LocalVacinacao(16, "USF Moreninha", endereco1));
//		 localVacinacao.add( new LocalVacinacao(17, "USF Itamaracá", endereco1));
//		 localVacinacao.add( new LocalVacinacao(18, "UBS Universitário", endereco1));
//		 localVacinacao.add( new LocalVacinacao(19, "UBS Lar do Trabalhador", endereco1));
//		 localVacinacao.add( new LocalVacinacao(20, "USF Albino Coimbra", endereco1));
//		 localVacinacao.add( new LocalVacinacao(21, "UBS Silia Regina", endereco1));
//		 localVacinacao.add( new LocalVacinacao(22, "UBS Jockey Club", endereco1));
//		 localVacinacao.add( new LocalVacinacao(23, "UBS Dona Neta", endereco1));
//		 localVacinacao.add( new LocalVacinacao(24, "C.F Iracy Coelho", endereco1));
//		 localVacinacao.add( new LocalVacinacao(25, "USF Los Angeles", endereco1));
		 
		//imprime toda Lista Vacina
		for (LocalVacinacao lv: localVacinacao) {
			System.out.println(lv);
		}	
//		 
//		 Pessoa pessoa1 = new Pessoa("nome", 65, 'M', "cpf", "celular", 0, endereco1, "Professor", false, "Indíngena", false);
//		 System.out.println(pessoa1.toString());
//		 
//		 
//		 
//		 Funcionario funcionario1 = new Funcionario("nome", 38, 'M', "cpf", "celular", 0, endereco1, "profissao", false, "raca", false);
//		 System.out.println(funcionario1.toString());
//		 
//		 CarteiraVacina carteiraVacinacao = new CarteiraVacina(localVacinacao1, pessoa1, funcionario1, vacina1);
//		 System.out.println(carteiraVacinacao.toString());
		 
		 //Verificar como colocar isso no Construtor
//		 System.out.println("Prioridade: " + Prioridade.verificaPrioridade(pessoa1));
//		 
//		 System.out.println(pessoa1.validarCPF("00409163163")); //Colocar sem simbolos
	}

}
