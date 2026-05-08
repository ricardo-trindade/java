package If;

import java.util.Scanner;

public class If_PositivoNegativoZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu número: ");
		double n = sc.nextDouble();
		
		if (n < 0) {
	    System.out.print("O número é negativo");
		} else if (n == 0) {
		System.out.print("O número é igual a zero");
		} else if (n > 0) {
		System.out.print("O número é positivo");
		}
		
		sc.close();

	}

}
