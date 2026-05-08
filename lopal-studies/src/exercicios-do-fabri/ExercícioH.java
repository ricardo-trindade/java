package IMC;

import java.util.Scanner;

public class ExercícioH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura da caixa: ");
		double larg = sc.nextDouble();
		
		System.out.print("Digite o comprimento da caixa: ");
		double comp = sc.nextDouble();
		
		System.out.print("Digite a largura da caixa: ");
		double alt = sc.nextDouble();
		
		double vol = larg * comp * alt;
		
		System.out.printf("O volume de sua caixa é: %.2f ",vol);
		
		sc.close();
		
		
		

	}

}
