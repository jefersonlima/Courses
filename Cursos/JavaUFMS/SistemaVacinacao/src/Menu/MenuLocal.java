package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import LocalVacinacao.LocalVacinacao;
import Endereco.Endereco;

public class MenuLocal{
    Scanner in = new Scanner(System.in);
    ArrayList<LocalVacinacao> listaLocalVacina = new ArrayList<LocalVacinacao>();

    public void getMenuLocal() {
        int op = 1;
        while(op != 0){
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
            switch(op){
                case 1:
                    System.out.println("----- Cadastro de Local de Vacinação! -----");
                    cadastrarLoval();
                break;
                case 2:
                    System.out.println("----- Listam de Local de Vacinação! -----");
                    listagemLocal();
                break;
                case 3:
                    System.out.println("----- Alterar Local de Vacinação! -----");
                    alterarLocal();
                break;
                case 4:
                    System.out.println("----- Deletar Local de Vacinação! -----");
                    deletarLocal();
                break;
                case 99:
                    popularLocais();
                break;
            }
        }
    }

    private void popularLocais(){
        List<Endereco> endereco = new ArrayList<Endereco>();
		// Endereços
		endereco.add( new Endereco("Rua Ayrton Senna", 114, "Belo Jardim II", "Rio Branco","69908032"));
		endereco.add( new Endereco("Rua Via Firenze", 192, "Jardim Vila Paradiso", "Indaiatuba","13331563"));
		endereco.add( new Endereco("Servidão Nove de Novembro", 945, "Retiro", "Volta Redonda","27277212"));
		endereco.add( new Endereco("Rua Quatro", 772, "Quintas Coloniais", "Contagem","32044480"));

        listaLocalVacina.add(new LocalVacinacao("Rua da Paz", endereco.get(0)));
        listaLocalVacina.add(new LocalVacinacao("Centro", endereco.get(1)));
        listaLocalVacina.add(new LocalVacinacao("Aero Racho", endereco.get(2)));
        listaLocalVacina.add(new LocalVacinacao("Itamaraca", endereco.get(3)));


    }

    private void cadastrarLoval(){
        System.out.println("Informe o nome do local:");
        String nomeLocal = in.nextLine();
        Endereco endereco;

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

        LocalVacinacao localvacina = new LocalVacinacao(nomeLocal, endereco);
        listaLocalVacina.add(localvacina);
        System.out.println("----- Local cadastrado com sucesso! -----");
    }

    private void listagemLocal(){
        for (LocalVacinacao lv: listaLocalVacina) {
			System.out.println(lv);
		}
    }

    private void alterarLocal(){
        
    }

    private void deletarLocal(){
        
    }

}