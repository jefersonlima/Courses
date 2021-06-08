package Vacina;

public class Vacina {
	
	//private static int codVacina = 0;
	private String nomeVacina;
	private String fabricante;
	private Integer duracao;
	private Integer idadeMinima;
	private Integer dose;
	private Integer eficacia;
	private String restricoes;
	
	public Vacina(String nomeVacina, String fabricante, Integer duracao, Integer idadeMinima, Integer dose, Integer eficacia, String restricoes) {
		super();
		//codVacina += 1;
		this.nomeVacina = nomeVacina;
		this.fabricante = fabricante;
		this.duracao = duracao;
		this.idadeMinima = idadeMinima;
		this.dose = dose;
		this.eficacia = eficacia;
		this.restricoes = restricoes;
	}

	//public int getCodVacina() {
	//	return codVacina;
	//}

	//public void setCodVacina(int codVacina) {
	//	this.codVacina = codVacina;
	//}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Integer getIdadeMinima() {
		return idadeMinima;
	}

	public void setIdadeMinima(Integer idadeMinima) {
		this.idadeMinima = idadeMinima;
	}

	public Integer getDose() {
		return dose;
	}

	public void setDose(Integer dose) {
		this.dose = dose;
	}

	public Integer getEficacia() {
		return eficacia;
	}

	public void setEficacia(Integer eficacia) {
		this.eficacia = eficacia;
	}

	public String getRestricoes() {
		return restricoes;
	}

	public void setRestricoes(String restricoes) {
		this.restricoes = restricoes;
	}


	@Override
	public String toString() {
		return "Vacina:" +
				//"\nCodigo Vacina: " + codVacina + 
				"\nNome Vacina: " + nomeVacina + 
				"\nFabricante: " + fabricante + 
				"\nDuracao em Meses: " + duracao + 
				"\nIdade Minima: " + idadeMinima + 
				"\nQuantidade de Doses: " + dose + 
				"\nEficacia em: " + eficacia + "%" +
				"\nRestrições: "	+ restricoes + "\n";
	}	
	
}