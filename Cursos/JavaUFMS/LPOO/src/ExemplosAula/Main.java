package ExemplosAula;

public class Main {

	public static void main(String[] args) {
		/*
		 * Pessoa p1 = new Pessoa(); Pessoa p2 = new Pessoa("Joao", 20);
		 * 
		 * p1.imprimir(); p2.imprimir();
		 * 
		 * p1.setIdade(12); p1.setNome("Maria");
		 * 
		 * p1.imprimir();
		 * 
		 * p2.setIdade(22); p2.imprimir();
		 */	
		
		Aluno a1 = new Aluno();
		a1.imprimir();
		Aluno a2 = new Aluno("Pedro", 31,"Técnico Informática", "123456", "123.654.321-45");
		a2.imprimir();
		
	}

}
