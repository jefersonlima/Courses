package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LocalVacinacao.LocalVacinacao;
import Endereco.Endereco;
import Interfaces.Menu;

public class MenuLocal implements Menu {
	Scanner in = new Scanner(System.in);
	ArrayList<LocalVacinacao> listaLocalVacina = new ArrayList<LocalVacinacao>();

	public boolean isLocalVacina() {
		return listaLocalVacina.size() != 0 ? true : false;
	}

	@Override
	public void getMenu() {
		int op = 1;
		while (op != 0) {
			System.out.println("###################LOCALVACINA####################\n"
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
		System.out.println("Informe o nome do local:");
		String nomeLocal = in.nextLine();
		Endereco endereco;

		System.out.println("----- Cadastro de Endere??o -----");
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

		LocalVacinacao localvacina = new LocalVacinacao(nomeLocal, endereco);
		listaLocalVacina.add(localvacina);
		System.out.println("##### Local cadastrado com sucesso! #####");
	}

	@Override
	public void consultar() {
		if (isListEmpty()) {
			return;
		}
		System.out.println("----- Informe o Nome do Local que deseja consultar -----");
		String nomeLocal = in.nextLine();
		for (LocalVacinacao lv : listaLocalVacina) {
			if (lv.getNomeLocal().equals(nomeLocal)) {
				System.out.println("----- Local encontrado -----");
				System.out.println(lv);
				return;
			}
		}
		System.out.println("#####         Local nao encontrado!          #####");
	}

	public LocalVacinacao consultarLocalVacinar(String nomeLocal) throws Exception {
		for (LocalVacinacao lv : listaLocalVacina) {
			if (lv.getNomeLocal().equals(nomeLocal)) {
				return lv;
			}
		}
		return null;

	}

	@Override
	public void listagem() {
		if (isListEmpty()) {
			return;
		}
		for (LocalVacinacao lv : listaLocalVacina) {
			System.out.println(lv);
		}
	}

	@Override
	public void alterar() {
		if (isListEmpty()) {
			return;
		}
		System.out.println("##### Qual cadastro deseja alterar? #####");
		System.out.println("##### Informe o Nome do Local que deseja alterar o cadastro! #####");
		String nomeIn = in.nextLine();
		for (LocalVacinacao lv : listaLocalVacina) {
			if (lv.getNomeLocal().equals(nomeIn)) {
				int op = 1;
				while (op != 0) {
					System.out.println("##################################################\n"
							+ "##### Seleciona oque deseja alterar!         #####\n"
							+ "##### 1 - Nome do Local:                     #####\n"
							+ "##### 2 - Endere??o:                          #####\n"
							+ "##### 0 - Sair                               #####\n"
							+ "##################################################");
					op = in.nextInt();
					in.nextLine();

					switch (op) {
						case 1:
							System.out.println("Informe um novo Nome do Local:");
							lv.setNomeLocal(in.nextLine());
							break;
						case 2:
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
								lv.setEndereco(new Endereco(rua, numero, bairro, cidade, cep));
							} else {
								lv.setEndereco(new Endereco(rua, numero, bairro, cidade));
							}
							break;
					}
				}
				return;
			}
		}
		System.out.println("#####         Local nao encontrado!          #####");
	}

	@Override
	public void deletar() {
		if (isListEmpty()) {
			return;
		}
		System.out.println("##### Informe o CPF para deletar! #####");
		String nomeLocal = in.nextLine();
		for (LocalVacinacao lv : listaLocalVacina) {
			if (lv.getNomeLocal().equals(nomeLocal)) {
				listaLocalVacina.remove(lv);
				System.out.println("##### Pessoa deletada! #####");
				return;
			}
		}
		System.out.println("#####         Local nao encontrado!          #####");
	}

	@Override
	public void popular() {
		List<Endereco> endereco = new ArrayList<Endereco>();
		// Endere??os
		endereco.add(new Endereco("Rua Ayrton Senna", 114, "Belo Jardim II", "Rio Branco", "69908032"));
		endereco.add(new Endereco("Rua Via Firenze", 192, "Jardim Vila Paradiso", "Indaiatuba", "13331563"));
		endereco.add(new Endereco("Servidao Nove de Novembro", 945, "Retiro", "Volta Redonda", "27277212"));
		endereco.add(new Endereco("Rua Quatro", 772, "Quintas Coloniais", "Contagem", "32044480"));

		listaLocalVacina.add(new LocalVacinacao("Guanandizao", endereco.get(0)));
		listaLocalVacina.add(new LocalVacinacao("Centro", endereco.get(1)));
		listaLocalVacina.add(new LocalVacinacao("Ayrton Senna", endereco.get(2)));
		listaLocalVacina.add(new LocalVacinacao("Albano Franco", endereco.get(3)));

		System.out.println("#####    Itens cadastrados " + listaLocalVacina.size() + "                 #####");
	}

	public boolean isListEmpty() {
		if (listaLocalVacina.size() == 0) {
			System.out.println("#####         Nao a items na lista!          #####");
			return true;
		}
		return false;
	}
}