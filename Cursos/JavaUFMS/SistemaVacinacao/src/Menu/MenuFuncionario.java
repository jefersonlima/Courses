package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Endereco.Endereco;
import Funcionario.Funcionario;
import Pessoa.Pessoa;

public class MenuFuncionario {
	Scanner in = new Scanner(System.in);
	
	List<Funcionario> listFuncionario = new ArrayList<Funcionario>();
	
	public void getMenuFuncionario() {
		int op = 1;
		while(op != 0) {
			System.out.println(
					"Selecione uma opÁ„o:\n"
					+ "1 - Cadastrar novo Funcion·rio\n"
					+ "2 - Listar Todas Funcion·rios Cadastradas \n"
					+ "3 - Alterar um Funcion·rio\n"
					+ "4 - Deletar um Funcion·rio\n"
					+ "0 - Voltar"
			);
			 op = in.nextInt();
			switch(op) {
				case 1: 
					// Cadastrar
					System.out.println("----- Cadastrar Funcion·rio -----");
					CadastrarFuncionario();
					System.out.println("---------------");
				break;
				case 2: 
					// Listar
					System.out.println("----- Listar Funcion·rios -----");
					ListarFuncionario();
					System.out.println("---------------");
				break;
				case 3:
					// Alterar
					System.out.println("----- Alterar Funcion·rio -----");
					AlterarFuncionario();
					System.out.println("---------------");
				break;
				case 4:
					// Deletar
					System.out.println("----- Deletar Funcion·rio -----");
					deletarFuncionario();
					System.out.println("---------------");
				break;
				case 99:
					populaFuncionario();
				break;
				default:
				break;
			}	
		}
	}
	
	private void populaFuncionario() {
		List<Endereco> endereco = new ArrayList<Endereco>();
		// Endere√ßos
		endereco.add( new Endereco("Rua Ayrton Senna", 114, "Belo Jardim II", "Rio Branco","69908032"));
		endereco.add( new Endereco("Rua Via Firenze", 192, "Jardim Vila Paradiso", "Indaiatuba","13331563"));
		endereco.add( new Endereco("Servid√£o Nove de Novembro", 945, "Retiro", "Volta Redonda","27277212"));
		endereco.add( new Endereco("Rua Quatro", 772, "Quintas Coloniais", "Contagem","32044480"));

		// Pessoas
		listFuncionario.add(new Funcionario("Gilson Jose do Santos", 26, 'M', "87025384828", "(67) 99459-3797", endereco.get(0), "Designer", false, "Pardo", false, 0));
		listFuncionario.add(new Funcionario("Jeferson", 65, 'M', "70429878109", "(83) 99940-1105", endereco.get(1), "Professor", false, "Preto", false, 1));
		listFuncionario.add(new Funcionario("Henrique Theo Guilherme Rezende", 65, 'M', "54058291451", "(68)99164-9104", endereco.get(2), "Professor", true, "Branco", false, 2));
		listFuncionario.add(new Funcionario("Isadora", 50, 'F', "45457869369", "(62) 98528-9986", endereco.get(3), "Professor", false, "Parda", true, 3));
	}

	private void CadastrarFuncionario() {
		Funcionario funcionario;
		Endereco endereco;
		System.out.println("Informe o nome:");
		String nome = in.nextLine();
		
		System.out.println("Informe a idade:");
		Integer idade = in.nextInt();
		
		System.out.println("Informe o genero:");
		char sexo  = in.next().charAt(0);
		
		System.out.println("Informe o CPF:");
		String cpf = in.next();
		in.nextLine();
		
		System.out.println("Informe o n√∫mero de celular:");
		String celular = in.nextLine();
		
		System.out.println("----- Cadastro de Endere√ßo -----");
		System.out.println("Informe a rua:");
		String rua = in.nextLine();

		System.out.println("Informe o n√∫mero:");
		int numero = in.nextInt();
		in.nextLine();

		System.out.println("Informe o Bairro:");
		String bairro = in.nextLine();

		System.out.println("Informe a cidade:");
		String cidade = in.nextLine();

		System.out.println("Informe o CEP: (campo pode ser em branco!)");
		String cep = in.nextLine();

		if(cep!=null){
			endereco = new Endereco(rua, numero, bairro, cidade,cep);
		}else{
			endereco = new Endereco(rua, numero, bairro, cidade);
		}

		System.out.println("Informe a profiss√£o:");
		String profissao = in.nextLine();

		System.out.println("Informe se tem comorbidade: S/N");
		char valComorbidade = in.next().charAt(0);
		boolean comorbidade;
		if(valComorbidade == 'S'){
			comorbidade = true;
		}else{
			comorbidade = false;
		}

		in.nextLine();
		System.out.println("Informe a ra√ßa que se identifica:");
		String raca = in.nextLine();
		boolean gestante;
		if (sexo == 'M') {
			gestante = false;
		}else {
			System.out.println("Informe se √© gestante: True/False");
			gestante = in.nextBoolean();
		}
		
		System.out.println("Informe o CÛdigo de Matricula!:");
		int codMatricula = in.nextInt();
		in.nextLine();

		// Validar CPF antes de incerir na Lista
		funcionario = new Funcionario();
		funcionario.setCpf(cpf);
		while(!funcionario.validarCPF(cpf)){
			System.out.println("Informe um CPF valido:");
			cpf = in.next();
			in.nextLine();
		}

		funcionario = new Funcionario(nome, idade, sexo, cpf, celular, endereco, profissao, comorbidade, raca, gestante, codMatricula);
		listFuncionario.add(funcionario);
		System.out.println("----- Pessoa cadastrada com sucesso! -----");
	}
	
	public void ListarFuncionario() {
		if(listFuncionario.size() == 0){
			System.out.println("N„o Existe Vacina para Listar!");
			return;
		}
		for (Funcionario v: listFuncionario) {
			System.out.println(v);
		}
	}
	
	private void  AlterarFuncionario(){
		if (listFuncionario.size() == 0) {
			System.out.println("N√£o a pessoas para alterar!");
			return;
		}
		System.out.println("----- Qual cadastro deseja alterar? -----");
		System.out.println("----- Informe o cpf que deseja alterar o cadastro! -----");
		String cpfIn = in.next();
		for (Pessoa p : listFuncionario) {
			if(p.getCpf().equals(cpfIn)){
				System.out.println(p.getNome());
				int op = 1;
				while(op != 0){
					System.out.println("Seleciona oque deseja alterar!\n"
						+"1 - Endere√ßo:\n"
						+"2 - Idade:\n"
						+"3 - Celular:\n"
						+"4 - Profissao:\n"
						+"5 - Comorbidade:\n"
						+"0 - Sair");
					op = in.nextInt();
					in.nextLine();
					
					switch(op){
						case 1:
							System.out.println("\nInforme a rua:");
							String rua = in.nextLine();

							System.out.println("Informe o n√∫mero:");
							int numero = in.nextInt();
							in.nextLine();

							System.out.println("Informe o Bairro:");
							String bairro = in.nextLine();

							System.out.println("Informe a cidade:");
							String cidade = in.nextLine();

							System.out.println("Informe o CEP: (campo pode ser em branco!)");
							String cep = in.nextLine();

							if (cep != null) {
								p.setEndereco( new Endereco(rua, numero, bairro, cidade, cep));
							} else {
								p.setEndereco( new Endereco(rua, numero, bairro, cidade));
							}
						break;
						case 2:
							System.out.println("Informe a Idade:");
							p.setIdade(in.nextInt());
						break;
						case 3:
							System.out.println("Informe o n√∫mero de celular:");
							p.setCelular(in.nextLine());
						break;
						case 4:
							System.out.println("Informe a profiss√£o:");
							p.setProfissao(in.nextLine());
						break;
						case 5:
							System.out.println("Informe se tem comorbidade: S/N");
							char comorbidade = in.next().charAt(0);
							if (comorbidade == 'S') {
								p.setComorbidade(true);
							} else {
								p.setComorbidade(false);
							}
						break;
					}
				}
				

				
			}
		}
		System.out.println("----- CPF n„o encontrado! -----");
	}

	private void deletarFuncionario() {
		if(listFuncionario.size() == 0){
			System.out.println("N„o existem funcion·rios para deletar!");
			return;
		}
		System.out.println("----- Informe o CPF para deletar! -----");
		String cpfIn = in.next();
		for (Funcionario p : listFuncionario) {
			if(p.getCpf().equals(cpfIn)){
				listFuncionario.remove(p);
				System.out.println("----- funcion·rios deletadu! -----");
				break;
			}
		}
		System.out.println("----- funcion·rios n„o encontrado! -----");
	}
}