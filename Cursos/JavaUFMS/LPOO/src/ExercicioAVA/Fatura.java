package ExercicioAVA;

import java.util.Scanner;

public class Fatura {
	/*
	 * Criar uma classe Fatura que contenha:
	 * 
	 * a) Atributos: - Uma descrição do item comprado (String) - Uma quantidade de
	 * itens comprados (int) - O preço de cada item (float)
	 * 
	 * 
	 * a) Criar um construtor vazio
	 * 
	 * b) Criar um método setValores que receba a descrição, a quantidade e o preço
	 * de um item e armazene na classe Fatura.
	 * 
	 * c) Criar um método lerItem, que leia a descrição, a quantidade e o preço de
	 * um item e chame o método setValores para armazenar os valores lidos.
	 * 
	 * b) Criar um método getPrecoTotal que retorna o preço total da venda daquele
	 * item (preço de cada item X quantidade)
	 * 
	 * c) Criar um método main que:
	 * 
	 * -Cria uma instância da classe Fatura -Chame o método lerItem que leia as
	 * informações de um item de compra e armazene na classe Fatura -Chame o método
	 * para calcular o preço total de um item da Fatura -Imprima o preço total deste
	 * item conforme exemplo abaixo, com uma casa decimal.
	 * 
	 * Obs: Não imprima nenhuma mensagem, espaço, nem caracter além do exemplo
	 * acima, pois como no URI, a verificação falha se a saída for diferente. Não
	 * esqueça de imprimir o fim de linha após o último resultado.
	 */
	
	String descricao;
	int quantidade;
	float preco;

	public Fatura() {
		super();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void lerItem() {
		Scanner in = new Scanner(System.in);
		String descricao = in.nextLine();
		int quantidade = in.nextInt();
		float preco = in.nextFloat();

		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		in.close();

	}

	public float precoTotal() {
		return this.preco * this.quantidade;
	}

	public static void main(String[] args) {
		Fatura f1 = new Fatura();

		f1.lerItem();

		System.out.printf("%d x %s = %.1f", f1.quantidade, f1.descricao, f1.precoTotal());

	}

}
