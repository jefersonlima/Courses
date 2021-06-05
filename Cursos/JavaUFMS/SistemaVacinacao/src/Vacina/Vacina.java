package Vacina;

public class Vacina {
	
	private int codVacina;
	private String nomeVacina;
	private String fabricante;
	private Integer duracao;
	private Integer idadeMinima;
	private Integer dose;
	private Integer efic�cia;
	private String restricoes;
	
	public Vacina(int codVacina, String nomeVacina, String fabricante, Integer duracao, Integer idadeMinima, Integer dose, Integer efic�cia, String restricoes) {
		super();
		this.codVacina = codVacina;
		this.nomeVacina = nomeVacina;
		this.fabricante = fabricante;
		this.duracao = duracao;
		this.idadeMinima = idadeMinima;
		this.dose = dose;
		this.efic�cia = efic�cia;
		this.restricoes = restricoes;
	}

	public int getCodVacina() {
		return codVacina;
	}

	public void setCodVacina(int codVacina) {
		this.codVacina = codVacina;
	}

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

	public Integer getEfic�cia() {
		return efic�cia;
	}

	public void setEfic�cia(Integer efic�cia) {
		this.efic�cia = efic�cia;
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
				"\nC�digo Vacina: " + codVacina + 
				"\nNome Vacina: " + nomeVacina + 
				"\nFabricante: " + fabricante + 
				"\nDuracao em Meses: " + duracao + 
				"\nIdade M�nima: " + idadeMinima + 
				"\nQuantidade de Doses: " + dose + 
				"\nEfic�cia em %: " + efic�cia + 
				"\nRestri��es: "	+ restricoes + "\n";
	}	
	
	public String compareTo() {
		return "M�todo CompareTo N�o implementado\n";
	}
}
