package Menu;

import java.util.ArrayList;
import java.util.Scanner;
import Pessoa.Pessoa;
import Endereco.Endereco;

public class MenuPessoa{
	Scanner in = new Scanner(System.in);
	ArrayList<Pessoa> listPessoa = new ArrayList<Pessoa>();

	public void getMenuPessoa() {
		int op = 1;
		while(op != 0) {
			System.out.println(
					"Selecione as ações abaixo:\n"
					+ "1 - Cadastrar\n"
					+ "2 - Listar\n"
					+ "3 - Alterar\n"
					+ "4 - Deletar\n"
					+ "0 - Voltar"
				); 
			op = in.nextInt();
			in.nextLine();
			switch(op) {
				case 1: 
					// Cadastrar
					System.out.println("----- Cadastrar de Pessoa -----");
					CadastrarPessoa();
				break;
				case 2: 
					// Listar
					System.out.println("----- Lista de Pessoas -----");
					ListarPessoas();
					System.out.println("---------------");
				break;
				case 3:
					// Alterar
					System.out.println("Alterar");
				break;
				case 4:
					// Deletar
					System.out.println("Deletar");
				break;
				default:
				break;
			}
		}
}

	public void CadastrarPessoa(){
		Pessoa pessoa;
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
		
		System.out.println("Informe o número de celular:");
		String celular = in.nextLine();
		
		System.out.println("----- Cadastro de Endereço -----");
		System.out.println("Informe a rua:");
		String rua = in.nextLine();
		System.out.println("Informe o número:");
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
		System.out.println("Informe a profissão:");
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
		System.out.println("Informe a raça que se identifica:");
		String raca = in.nextLine();
		boolean gestante;
		if (sexo == 'M') {
			gestante = false;
		}else {
			System.out.println("Informe se é gestante: True/False");
			gestante = in.nextBoolean();
		}
		pessoa = new Pessoa();
		pessoa.setCpf(cpf);
		while(!pessoa.validarCPF(cpf)){
			System.out.println("Informe um CPF valido:");
			cpf = in.next();
			in.nextLine();
		}
		pessoa = new Pessoa(nome, idade, sexo, cpf, celular, endereco, profissao, comorbidade, raca, gestante);
		listPessoa.add(pessoa);
		
		System.out.println("----- Pessoa cadastrada com sucesso! -----");
	}

	public void ListarPessoas() {
		for (Pessoa p: listPessoa) {
			System.out.println(p);
		}
	}
}
