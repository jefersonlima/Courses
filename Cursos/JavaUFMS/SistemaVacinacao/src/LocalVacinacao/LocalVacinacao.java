package LocalVacinacao;

import Endereco.Endereco;

public class LocalVacinacao {
	private int codLocalVacinacao;
	private String NomeLocal;
	private Endereco endereco;
	
	public LocalVacinacao(int codLocalVacinacao, String nomeLocal, Endereco endereco) {
		super();
		this.codLocalVacinacao = codLocalVacinacao;
		this.NomeLocal = nomeLocal;
		this.endereco = endereco;
	}

	public int getCodLocalVacinacao() {
		return codLocalVacinacao;
	}

	public void setCodLocalVacinacao(int codLocalVacinacao) {
		this.codLocalVacinacao = codLocalVacinacao;
	}

	public String getNomeLocal() {
		return NomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		NomeLocal = nomeLocal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "LocalVacinacao:\n" +
				"Nome do Local: " + NomeLocal + 
				"Endereco" + endereco.toString();
	}

}
