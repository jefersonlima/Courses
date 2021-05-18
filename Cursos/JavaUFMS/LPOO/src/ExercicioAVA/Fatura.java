package ExercicioAVA;

import java.util.Scanner;

public class Fatura {
	/*
	 * Criar uma classe Fatura que contenha:
	 * 
	 * a) Atributos: - Uma descri��o do item comprado (String) - Uma quantidade de
	 * itens comprados (int) - O pre�o de cada item (float)
	 * 
	 * 
	 * a) Criar um construtor vazio
	 * 
	 * b) Criar um m�todo setValores que receba a descri��o, a quantidade e o pre�o
	 * de um item e armazene na classe Fatura.
	 * 
	 * c) Criar um m�todo lerItem, que leia a descri��o, a quantidade e o pre�o de
	 * um item e chame o m�todo setValores para armazenar os valores lidos.
	 * 
	 * b) Criar um m�todo getPrecoTotal que retorna o pre�o total da venda daquele
	 * item (pre�o de cada item X quantidade)
	 * 
	 * c) Criar um m�todo main que:
	 * 
	 * -Cria uma inst�ncia da classe Fatura -Chame o m�todo lerItem que leia as
	 * informa��es de um item de compra e armazene na classe Fatura -Chame o m�todo
	 * para calcular o pre�o total de um item da Fatura -Imprima o pre�o total deste
	 * item conforme exemplo abaixo, com uma casa decimal.
	 * 
	 * Obs: N�o imprima nenhuma mensagem, espa�o, nem caracter al�m do exemplo
	 * acima, pois como no URI, a verifica��o falha se a sa�da for diferente. N�o
	 * esque�a de imprimir o fim de linha ap�s o �ltimo resultado.
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
