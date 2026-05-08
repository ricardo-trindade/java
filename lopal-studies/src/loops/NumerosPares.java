package Loops;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		
		int n;
		n = sc.nextInt();
		System.out.println("Números pares: ");
		
		for (int i = 0; i < n; i = i+2) {
			
		System.out.println(i+2);
			
		}
		
		sc.close();
	}

}
