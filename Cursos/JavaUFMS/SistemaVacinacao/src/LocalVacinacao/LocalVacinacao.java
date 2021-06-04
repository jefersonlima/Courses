package LocalVacinacao;

import Endereco.Endereco;

public class LocalVacinacao {
	private String NomeLocal;
	private Endereco endereco;
	
	public LocalVacinacao(String nomeLocal, Endereco endereco) {
		super();
		NomeLocal = nomeLocal;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "LocalVacinacao:\n" +
				"Nome do Local: " + NomeLocal + 
				"Endereco" + endereco.toString();
	}

}
