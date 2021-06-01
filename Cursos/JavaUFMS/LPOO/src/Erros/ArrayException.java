package Erros;

public class ArrayException {

	public static void main(String[] args) {
		int[]num1 = new int[5];
		int[]num2 = new int[10];
		
		try {
			for(int i = 0; i < num2.length; i++) {
				num1[i]=i;
				num2[i]=2*i;
				System.out.println(num2[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array fora do intervalido");
		}

	}

}
