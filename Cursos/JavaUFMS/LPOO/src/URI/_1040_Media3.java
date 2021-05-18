package URI;
import java.util.Scanner;

public class _1040_Media3 {

	public static void main(String[] args) {
		/*
		 * Leia quatro n�meros (N1, N2, N3, N4), cada um deles com uma casa decimal,
		 * correspondente �s quatro notas de um aluno. Calcule a m�dia com pesos 2, 3, 4
		 * e 1, respectivamente, para cada uma destas notas e mostre esta m�dia
		 * acompanhada pela mensagem "Media: ". Se esta m�dia for maior ou igual a 7.0,
		 * imprima a mensagem "Aluno aprovado.". Se a m�dia calculada for inferior a
		 * 5.0, imprima a mensagem "Aluno reprovado.". Se a m�dia calculada for um valor
		 * entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem
		 * "Aluno em exame.".
		 * 
		 * No caso do aluno estar em exame, leia um valor correspondente � nota do exame
		 * obtida pelo aluno. Imprima ent�o a mensagem "Nota do exame: " acompanhada
		 * pela nota digitada. Recalcule a m�dia (some a pontua��o do exame com a m�dia
		 * anteriormente calculada e divida por 2). e imprima a mensagem
		 * "Aluno aprovado." (caso a m�dia final seja 5.0 ou mais ) ou
		 * "Aluno reprovado.", (caso a m�dia tenha ficado 4.9 ou menos). Para estes dois
		 * casos (aprovado ou reprovado ap�s ter pego exame) apresente na �ltima linha
		 * uma mensagem "Media final: " seguido da m�dia final para esse aluno.
		 * 
		 * Entrada A entrada cont�m quatro n�meros de ponto flutuante correspendentes as
		 * notas dos alunos.
		 * 
		 * Sa�da Todas as respostas devem ser apresentadas com uma casa decimal. As
		 * mensagens devem ser impressas conforme a descri��o do problema. N�o esque�a
		 * de imprimir o enter ap�s o final de cada linha, caso contr�rio obter�
		 * "Presentation Error".
		 */
		Scanner in = new Scanner(System.in);
		
		float N1, N2, N3, N4, NE, Media;
		
		N1 = in.nextFloat();
		N2 = in.nextFloat();
		N3 = in.nextFloat();
		N4 = in.nextFloat();
		
		N1 = N1 * 2;
		N2 = N2 * 3;
		N3 = N3 * 4;
		N4 = N4 * 1;
		
		Media = (N1 + N2 + N3 + N4 ) / 10;
		
		System.out.printf("Media: %.1f\n", Media );
		
		if(Media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}else if (Media < 5.0){
			System.out.println("Aluno reprovado.");
		}else {
			System.out.println("Aluno em exame.");
			NE = in.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", NE );
			
			Media = (Media + NE) / 2;
			if(Media >= 5.0) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", Media );
		}
		in.close();
	}
}
