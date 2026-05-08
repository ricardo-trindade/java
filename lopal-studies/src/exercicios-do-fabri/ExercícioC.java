package IMC;

import java.util.Scanner;

public class ExercícioC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite a altura da lata: ");
        double alt = sc.nextDouble();
        	
        System.out.print("Digite o raio da lata: ");
        double r = sc.nextDouble();
		
		double volume = 3.14159 * (r * r) * alt;
		
		System.out.printf("O volume da sua lata é %.2f",volume);
		
		sc.close();
		
		
		
	}

}
