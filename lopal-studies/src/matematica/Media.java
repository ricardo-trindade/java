package ExercíciosDeMatemática;

import java.util.Scanner;

public class Média {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double n2 = sc.nextDouble();

		double média = (n1 + n2) / 2;
		
		System.out.printf("A média entre os dois números é: " + "%.2f",média);
		
		sc.close();

	}

}
