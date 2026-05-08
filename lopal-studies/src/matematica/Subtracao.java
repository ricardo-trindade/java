package ExercíciosDeMatemática;

import java.util.Scanner;

public class Subtração {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double n2 = sc.nextDouble();

		double subtração = n1 - n2;
		
		System.out.printf("A subtração dos dois números é: " + "%.2f",subtração);
		
		sc.close();

	}

}
