package Colections;
import java.util.*;

public class TesteEmpregado {

	public static void main(String[] args) {
		List<Empregado> vec = new ArrayList<Empregado>();
		
		vec.add(new Empregado(11, "Karla"));
		vec.add(new Empregado(10, "Luiz"));
		vec.add(new Empregado(1, "Raphael"));
		vec.add(new Empregado(9, "Luciano"));
		
		for (Empregado e: vec) {
			System.out.println(e);
		}

	}

}
