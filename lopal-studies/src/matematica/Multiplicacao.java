package ExercíciosDeMatemática;

import java.util.Scanner;

public class Multiplicação {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double n2 = sc.nextDouble();

		double multiplicação = n1 * n2;
		
		System.out.printf("A multiplicação dos dois números é: " + "%.2f",multiplicação);
		
		sc.close();

	}

}
