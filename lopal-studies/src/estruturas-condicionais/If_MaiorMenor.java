package LOPAL;

import java.util.Scanner;

public class If_MaiorMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double n2 = sc.nextDouble();
		
		if (n1 > n2) {
	    System.out.println("O maior número é: " + n1);
	    System.out.println("O menor número é: " + n2 );
		} else if (n1 < n2) {
		System.out.println("O maior número é: " + n2 );
		System.out.println("O menor número é: " + n1 );
		} else if (n1 == n2) {
	    System.err.print("Erro: os dois números iguais");
		}
		
		sc.close();

	}

}
