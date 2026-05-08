package IMC;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua altura (em metros): ");
        double alt = sc.nextDouble();
        
        System.out.print("Digite o seu peso (em kg): ");
        double peso = sc.nextDouble();
        
        double imc = peso / (alt * alt);
        
        if (imc < 18.5) {
        System.out.printf("Seu imc é %.2f, ou seja, você está abaixo do peso.",imc);
        
        } else if (imc >= 18.5 && imc < 24.9) {
        System.out.printf("Seu imc é %.2f, ou seja, você está no peso ideal.",imc);
        
        }else{
        System.out.printf("Seu imc é %.2f, ou seja, você está acima do peso.",imc);
        	
        sc.close();
        
        	
        	
        	
        	
        	
        	
        	
        }
	
        
        
        
        
        
        
        
        
        }

}
