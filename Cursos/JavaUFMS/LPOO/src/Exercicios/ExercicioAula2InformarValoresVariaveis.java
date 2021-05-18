package Exercicios;

public class ExercicioAula2InformarValoresVariaveis {

	public static void main(String[] args) {
		//Quais sao os valores para as variaveis a, b, c, d e e?

		
		int a = 3;
		int b = 1;
		int c = b + 1;
		int d = c > ++b ? (a - 3) : b;
		int e = 4;
		if( d > a && b + 1 < a || b > 1)
		c += 7;
		if( -7 >= -c)
		a -= 4;
		else
		d *= 2;
		e = ++d % 3;
		b = d++ % 3;
		
		System.out.println("valor de a: " +a);
		System.out.println("valor de b: " +b);
		System.out.println("valor de c: " +c);
		System.out.println("valor de d: " +d);
		System.out.println("valor de e: " +e);
	}

}
