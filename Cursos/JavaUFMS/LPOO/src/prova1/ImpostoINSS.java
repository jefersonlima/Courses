package prova1;
import java.util.Scanner;

public class ImpostoINSS {
	double salario;

	public ImpostoINSS(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double calularINSS() {
		if(getSalario() <= 1100) {
			return (getSalario()/100) * 7.5;
		}else if(getSalario() > 1100 && getSalario() <= 2203.48) {
			return ((getSalario() - 1100)/100) * 9 + 82.50;
		}else if(getSalario() > 2203.48 && getSalario() <= 3305.22) {
			return ((getSalario() - 2203.48)/100) * 12 + 181.8123;
		}else if(getSalario() > 3305.22 && getSalario() <= 6433.57) {
			return ((getSalario() - 3305.22)/100) * 14 + 314.0199;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salarioEntrada = in.nextDouble();
		
		ImpostoINSS ipInss = new ImpostoINSS(salarioEntrada);
		
		System.out.printf("R$ %.2f\n", ipInss.calularINSS());
		in.close();
	}

}
