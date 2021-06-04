package Vacina;

public class Vacina {
	
	private String nomeVacina;
	private String fabricante;
	private Integer duracao;
	private Integer idadeMinima;
	private Integer dose;
	private Integer eficácia;
	private String restricoes;
	
	public Vacina(String nomeVacina, String fabricante, Integer duracao, Integer idadeMinima, Integer dose, Integer eficácia, String restricoes) {
		super();
		this.nomeVacina = nomeVacina;
		this.fabricante = fabricante;
		this.duracao = duracao;
		this.idadeMinima = idadeMinima;
		this.dose = dose;
		this.eficácia = eficácia;
		this.restricoes = restricoes;
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

	public Integer getEficácia() {
		return eficácia;
	}

	public void setEficácia(Integer eficácia) {
		this.eficácia = eficácia;
	}

	public String getRestricoes() {
		return restricoes;
	}

	public void setRestricoes(String restricoes) {
		this.restricoes = restricoes;
	}

	@Override
	public String toString() {
		return "\nVacina:" +
				"\nnomeVacina: " + nomeVacina + 
				"\nfabricante: " + fabricante + 
				"\nduracao: " + duracao + 
				"\nidadeMinima: " + idadeMinima + 
				"\ndose: " + dose + 
				"\neficácia: " + eficácia + 
				"\nrestricoes: "	+ restricoes + "\n";
	}	
	
	public String compareTo() {
		return "Método CompareTo Não implementado\n";
	}
}
