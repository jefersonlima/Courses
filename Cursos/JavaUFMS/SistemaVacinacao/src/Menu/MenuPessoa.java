package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Pessoa.Pessoa;
import Endereco.Endereco;
import Interfaces.Menu;

public class MenuPessoa implements Menu {
	Scanner in = new Scanner(System.in);
	ArrayList<Pessoa> listPessoa = new ArrayList<Pessoa>();

	public boolean isPessoa() {
		return listPessoa.size() != 0 ? true : false;
	}

	@Override
	public void getMenu() {
		int op = 1;
		while (op != 0) {
			System.out.println("#####################PESSOAS#######################\n"
					+ "##### Selecione as acoes abaixo!             #####\n"
					+ "##### 1 - Cadastrar                          #####\n"
					+ "##### 2 - Consultar                          #####\n"
					+ "##### 3 - Listar                             #####\n"
					+ "##### 4 - Alterar                            #####\n"
					+ "##### 5 - Deletar                            #####\n"
					+ "##### 0 - Voltar                             #####\n"
					+ "##################################################");
			op = in.nextInt();
			in.nextLine();
			switch (op) {
				case 1:
					// Cadastrar
					System.out.println("##################################################\n"
							+ "#####    Cadastrar                           #####");
					cadastrar();
					break;
				case 2:
					// Consultar
					System.out.println("##################################################\n"
							+ "#####    Consultar                           #####");
					consultar();
					break;
				case 3:
					// Listar
					System.out.println("##################################################\n"
							+ "#####    Listar                              #####");
					listagem();
					break;
				case 4:
					// Alterar
					System.out.println("##################################################\n"
							+ "#####    Alterar                             #####");
					alterar();
					break;
				case 5:
					// Deletar
					System.out.println("##################################################\n"
							+ "#####    Deletar                             #####");
					deletar();
					break;
				case 99:
					popular();
					break;
				default:
					System.out.println("Opcao invalida!");
					break;
			}
		}

	}

	@Override
	public void cadastrar() {
		Pessoa pessoa;
		Endereco endereco;
		System.out.println("Informe o nome:");
		String nome = in.nextLine();

		System.out.println("Informe a idade:");
		Integer idade = in.nextInt();

		System.out.println("Informe o genero:");
		char sexo = in.next().charAt(0);

		System.out.println("Informe o CPF:");
		String cpf = in.next();
		in.nextLine();

		System.out.println("Informe o numero de celular:");
		String celular = in.nextLine();

		System.out.println("----- Cadastro de Endereço -----");
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

		if (cep != null) {
			endereco = new Endereco(rua, numero, bairro, cidade, cep);
		} else {
			endereco = new Endereco(rua, numero, bairro, cidade);
		}

		System.out.println("Informe a profisssao:");
		String profissao = in.nextLine();

		System.out.println("Informe se tem comorbidade: S/N");
		char valComorbidade = in.next().charAt(0);
		boolean comorbidade;
		if (valComorbidade == 'S') {
			comorbidade = true;
		} else {
			comorbidade = false;
		}

		in.nextLine();
		System.out.println("Informe a raça que se identifica:");
		String raca = in.nextLine();
		boolean gestante;
		if (sexo == 'M') {
			gestante = false;
		} else {
			char gest = in.next().charAt(0);
			System.out.println("Informe se e gestante: S/N");
			if (gest == 'S') {
				gestante = true;
			} else {
				gestante = false;
			}
		}

		// Validar CPF antes de incerir na Lista
		pessoa = new Pessoa();
		pessoa.setCpf(cpf);
		while (!pessoa.validarCPF(cpf)) {
			System.out.println("Informe um CPF valido:");
			cpf = in.next();
			in.nextLine();
		}

		pessoa = new Pessoa(nome, idade, sexo, cpf, celular, endereco, profissao, comorbidade, raca, gestante);
		listPessoa.add(pessoa);
		System.out.println("----- Pessoa cadastrada com sucesso! -----");
	}

	@Override
	public void consultar() {
		if (isListEmpty()) {
			return;
		}
		System.out.println("##### Informe o CPF da pessoa que deseja consultar #####");
		String cpfIn = in.next();
		for (Pessoa p : listPessoa) {
			if (p.getCpf().equals(cpfIn)) {
				System.out.println("##### Pessoa encontrada #####");
				System.out.println(p);
				return;
			}
		}
		System.out.println("#####          CPF nao encontrado!           #####");
	}

	public Pessoa consultarLocalVacinar(String cpfIn) {
		for (Pessoa p : listPessoa) {
			if (p.getCpf().equals(cpfIn)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void listagem() {
		if (isListEmpty()) {
			return;
		}
		for (Pessoa p : listPessoa) {
			System.out.println(p);
		}
	}

	@Override
	public void alterar() {
		if (isListEmpty()) {
			return;
		}
		System.out.println("##### Qual cadastro deseja alterar? #####");
		System.out.println("##### Informe o cpf que deseja alterar o cadastro! #####");
		String cpfIn = in.next();
		for (Pessoa p : listPessoa) {
			if (p.getCpf().equals(cpfIn)) {
				System.out.println(p.getNome());
				int op = 1;
				while (op != 0) {
					System.out.println("##################################################\n"
							+ "##### Seleciona oque deseja alterar!         #####\n"
							+ "##### 1 - Endereço:                          #####\n"
							+ "##### 2 - Idade:                             #####\n"
							+ "##### 3 - Celular:                           #####\n"
							+ "##### 4 - Profissao:                         #####\n"
							+ "##### 5 - Comorbidade:                       #####\n"
							+ "##### 0 - Sair                               #####\n"
							+ "##################################################");
					op = in.nextInt();
					in.nextLine();

					switch (op) {
						case 1:
							System.out.println("\nInforme a rua:");
							String rua = in.nextLine();

							System.out.println("Informe o numero:");
							int numero = in.nextInt();
							in.nextLine();

							System.out.println("Informe o bairro:");
							String bairro = in.nextLine();

							System.out.println("Informe a cidade:");
							String cidade = in.nextLine();

							System.out.println("Informe o CEP: (campo pode ser em branco!)");
							String cep = in.nextLine();

							if (cep != null) {
								p.setEndereco(new Endereco(rua, numero, bairro, cidade, cep));
							} else {
								p.setEndereco(new Endereco(rua, numero, bairro, cidade));
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
				return;
			}
		}
		System.out.println("#####          CPF nao encontrado!           #####");
	}

	@Override
	public void deletar() {
		if (isListEmpty()) {
			return;
		}
		System.out.println("----- Informe o CPF para deletar! -----");
		String cpfIn = in.next();
		for (Pessoa p : listPessoa) {
			if (p.getCpf().equals(cpfIn)) {
				listPessoa.remove(p);
				System.out.println("----- Pessoa deletada! -----");
				return;
			}
		}
		System.out.println("#####          CPF nao encontrado!           #####");
	}

	@Override
	public void popular() {
		List<Endereco> endereco = new ArrayList<Endereco>();
		// Endereços
		endereco.add(new Endereco("Rua Ayrton Senna", 114, "Belo Jardim II", "Rio Branco", "69908032"));
		endereco.add(new Endereco("Rua Via Firenze", 192, "Jardim Vila Paradiso", "Indaiatuba", "13331563"));
		endereco.add(new Endereco("Servidao Nove de Novembro", 945, "Retiro", "Volta Redonda", "27277212"));
		endereco.add(new Endereco("Rua Quatro", 772, "Quintas Coloniais", "Contagem", "32044480"));
		endereco.add(new Endereco("Rua doze", 74, "Centro", "Sao Paulo", "32044480"));

		// Pessoas
		listPessoa.add(new Pessoa("Gilson Jose do Santos", 26, 'M', "87025384828", "(67) 99459-3797", endereco.get(0),
				"Designer", false, "Pardo", false));
		listPessoa.add(new Pessoa("Jeferson", 65, 'M', "98765432100", "(83) 99940-1105", endereco.get(1), "Professor",
				false, "Preto", false));
		listPessoa.add(new Pessoa("Henrique", 65, 'M', "54058291451", "(68) 99164-9104", endereco.get(2), "Professor",
				true, "Branco", false));
		listPessoa.add(new Pessoa("Isadora", 50, 'F', "45457869369", "(62) 98528-9986", endereco.get(3), "Professor",
				false, "Parda", true));
		listPessoa.add(new Pessoa("Jurema", 30, 'F', "45457869369", "(62) 98528-9986", endereco.get(4), "Professor",
				false, "Parda", true));

		System.out.println("#####    Itens cadastrados " + listPessoa.size() + "                 #####");
	}

	public boolean isListEmpty() {
		if (listPessoa.size() == 0) {
			System.out.println("#####         Nao a items na lista!          #####");
			return true;
		}
		return false;
	}
}
