package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Endereco.Endereco;
import Funcionario.Funcionario;
import Interfaces.Menu;
import Pessoa.Pessoa;
import Vacina.Vacina;

public class MenuFuncionario implements Menu{
	Scanner in = new Scanner(System.in);

	List<Funcionario> listFuncionario = new ArrayList<Funcionario>();

	public boolean isFuncionario(){
        return listFuncionario.size() != 0 ? true : false;
    }

	@Override
	public void getMenu() {
		int op = 1;
		while(op != 0) {
			System.out.println(
					"Selecione uma opcao:\n"
					+ "1 - Cadastrar novo Funcionario\n"
					+ "2 - Consultar um Funcionario\n"
					+ "3 - Listar Todas Funcionarios Cadastradas \n"
					+ "4 - Alterar um Funcionario\n"
					+ "5 - Deletar um Funcionario\n"
					+ "0 - Voltar"
			);
			 op = in.nextInt();
			switch(op) {
				case 1: 
					// Cadastrar
					System.out.println("----- Cadastrar Funcionario -----");
					cadastrar();
					System.out.println("---------------");
				break;
				case 2: 
					// Consultar
					System.out.println("----- Consultar Funcionarios -----");
					consultar();
					System.out.println("---------------");
				break;
				case 3: 
					// Listar
					System.out.println("----- Listar Funcionarios -----");
					listagem();
					System.out.println("---------------");
				break;
				case 4:
					// Alterar
					System.out.println("----- Alterar Funcionario -----");
					alterar();
					System.out.println("---------------");
				break;
				case 5:
					// Deletar
					System.out.println("----- Deletar Funcionario -----");
					deletar();
					System.out.println("---------------");
				break;
				case 99:
					popular();
				break;
				default:
				break;
			}	
		}	
	}

	@Override
	public void cadastrar() {
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

		System.out.println("Informe o numero de celular:");
		String celular = in.nextLine();

		System.out.println("----- Cadastro de Endereco -----");
		System.out.println("Informe a rua:");
		String rua = in.nextLine();

		System.out.println("Informe o numero:");
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

		System.out.println("Informe a profissao:");
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
		System.out.println("Informe a raca que se identifica:");
		String raca = in.nextLine();
		boolean gestante;
		if (sexo == 'M') {
			gestante = false;
		}else {
			System.out.println("Informe se e gestante: True/False");
			gestante = in.nextBoolean();
		}

		System.out.println("Informe o Codigo de Matricula!:");
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

	@Override
	public void consultar() {
		if(listFuncionario.size() == 0){
			System.out.println("Nao Existe Funcionario cadastrado para Consultar!");
			return;
		}
		System.out.println("----- Qual o Nome da funcionario que deseja Consultar? -----");
		System.out.println("----- Informe o Nome do Funcionario! -----");
				
		String nomeFuncionario = in.next();
		for (Funcionario v : listFuncionario) {
			if(v.getNome().equals(nomeFuncionario.toUpperCase())){
				System.out.println(v.toString());
			}
		}
	}

	@Override
	public void listagem() {
		if(listFuncionario.size() == 0){
			System.out.println("Nao Existe Vacina para Listar!");
			return;
		}
		for (Funcionario v: listFuncionario) {
			System.out.println(v);
		}
	}

	@Override
	public void alterar() {
		if (listFuncionario.size() == 0) {
			System.out.println("Nao a pessoas para alterar!");
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
						+"1 - Endereco:\n"
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

							System.out.println("Informe o numero:");
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
							System.out.println("Informe o numero de celular:");
							p.setCelular(in.nextLine());
						break;
						case 4:
							System.out.println("Informe a profissao:");
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
		System.out.println("----- CPF nao encontrado! -----");	
	}

	@Override
	public void deletar() {
		if(listFuncionario.size() == 0){
			System.out.println("Não existem funcionarios para deletar!");
			return;
		}
		System.out.println("----- Informe o CPF para deletar! -----");
		String cpfIn = in.next();
		for (Funcionario p : listFuncionario) {
			if(p.getCpf().equals(cpfIn)){
				listFuncionario.remove(p);
				System.out.println("----- funcionarios deletadu! -----");
				break;
			}
		}
		System.out.println("----- funcionarios nao encontrado! -----");
	}

	@Override
	public void popular() {
		List<Endereco> endereco = new ArrayList<Endereco>();
		// Enderecos
		endereco.add( new Endereco("Rua Ayrton Senna", 114, "Belo Jardim II", "Rio Branco","69908032"));
		endereco.add( new Endereco("Rua Via Firenze", 192, "Jardim Vila Paradiso", "Indaiatuba","13331563"));
		endereco.add( new Endereco("ServidÃ£o Nove de Novembro", 945, "Retiro", "Volta Redonda","27277212"));
		endereco.add( new Endereco("Rua Quatro", 772, "Quintas Coloniais", "Contagem","32044480"));

		// Pessoas
		listFuncionario.add(new Funcionario("Gilson Jose do Santos", 26, 'M', "87025384828", "(67) 99459-3797", endereco.get(0), "Designer", false, "Pardo", false, 0));
		listFuncionario.add(new Funcionario("Jeferson", 65, 'M', "70429878109", "(83) 99940-1105", endereco.get(1), "Professor", false, "Preto", false, 1));
		listFuncionario.add(new Funcionario("Henrique Theo Guilherme Rezende", 65, 'M', "54058291451", "(68)99164-9104", endereco.get(2), "Professor", true, "Branco", false, 2));
		listFuncionario.add(new Funcionario("Isadora", 50, 'F', "45457869369", "(62) 98528-9986", endereco.get(3), "Professor", false, "Parda", true, 3));	
	}
}