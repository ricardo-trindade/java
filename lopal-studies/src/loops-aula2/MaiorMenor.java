package Loop;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double n = sc.nextDouble();
		
		
		
		if (n > 10 && n < 20) {
		 System.out.println("O número está entre 11 e 19.");
		} else if (n > 30 && n < 40) {
		 System.out.println("O número está entre 31 e 39. ");
		} else {
		System.err.println("Número inválido. ");
		}

		sc.close();
	}

}
