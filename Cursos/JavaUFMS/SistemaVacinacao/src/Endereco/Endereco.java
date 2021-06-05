package Endereco;

public class Endereco {
	//Atributos
	private int codEndereco;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	
	// Contrutor Completo
	public Endereco(int codEndereco, String rua, int numero, String bairro, String cidade, String cep) {
		super();
		//Melhorar isso para auto incrementar
		this.codEndereco = codEndereco;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	// Construtor sem Cep
	public Endereco(int codEndereco, String rua, int numero, String bairro, String cidade) {
		super();
		//Melhorar isso para auto incrementar
		this.codEndereco = codEndereco;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = "NULL";
	}
	
	public void setCodEndereco(int codEndereco) {
		this.codEndereco = codEndereco;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getCodEndereco() {
		return codEndereco;
	}

	@Override
	public String toString() {
		return "CodEndereço: " + getCodEndereco() + 
				"\nAvenida / Rua / Travessa: " + getRua() +
				"\nNúmero: " + getNumero() +
				"\nBairro: " + getBairro() +
				"\nCidade: " + getCidade() +
				"\nCep: " + getCep() + "\n";
	}	
}
