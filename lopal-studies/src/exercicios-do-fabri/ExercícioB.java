package IMC;

import java.util.Scanner;

public class ExercícioB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    System.out.print("Digite a temperatura em graus fahrenheit: ");
	    double frnt = sc.nextDouble();

	    double celsius = ((frnt - 32) * 5) / 9;

	    System.out.printf("A temperatura em graus celsius é: %.2f graus celsius.",celsius);

	    sc.close();
	    

	}

}
