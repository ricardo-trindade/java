package Exercícios;

import java.util.Scanner;

public class ExercícioG {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int c = sc.nextInt();
        System.out.print("Digite o quarto valor: ");
        int d = sc.nextInt();

		System.out.println("Adição de A e B = " + (a + b));
		System.out.println("Adição de A e C = " + (a + c));
		System.out.println("Adição de A e D = " + (a + d));
		System.out.println("Adição de B e D = " + (b + c));
		System.out.println("Adição de B e D = " + (b + d));
		System.out.println("Adição de B e D = " + (c + d));

		System.out.println("Multiplicação de A e B = " + (a + b));
		System.out.println("Multiplicação de A e C = " + (a + c));
		System.out.println("Multiplicação de A e D = " + (a + d));
		System.out.println("Multiplicação de B e C = " + (b + c));
		System.out.println("Multiplicação de B e D = " + (b + d));
		System.out.println("Multiplicação de B e D = " + (c + d));

		

		sc.close();

	}

}
