package ExercíciosDeMatemática;

import java.util.Scanner;

public class Divisão {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double n2 = sc.nextDouble();

		double divisão = n1 / n2;
		
		System.out.printf("A divisão dos dois números é: " + "%.2f",divisão);
		
		sc.close();

	}

}
