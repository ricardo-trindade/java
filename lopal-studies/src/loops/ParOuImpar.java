package Loop;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double n;
		System.out.println("Digite o número: ");
		
		
		while (true) {
		n = sc.nextDouble();
			
		if (n % 2 == 0 && n != 0) {
		 System.out.println("Número par");
			
		} else if (n % 2 != n) {
		 System.out.println("Número ímpar");
		
		} else if (n == 0) {
		 System.out.println("O número é igual a 0");
		 sc.close();
		 break;
		 
		}
			
			
			
		}

	}

}
