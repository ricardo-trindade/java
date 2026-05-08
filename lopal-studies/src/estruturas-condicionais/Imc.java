package Desafio;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua altura (em metros): ");
        double alt = sc.nextDouble();
        
        System.out.print("Digite o seu peso (em kg): ");
        double peso = sc.nextDouble();
        
        double imc = peso / (alt * alt);
        
        //If's
        
        if (imc < 18.5) {
        System.out.printf("Seu imc é %.2f",imc);
        System.out.println();
        System.out.print("Você está abaixo do peso ideal");
        
        } else if (imc >= 18.5 && imc < 24.9) {
        System.out.printf("Seu imc é %.2f",imc);
        System.out.println();
        System.out.print("Você está no peso ideal");
        
        } else if (imc >= 25 && imc <= 29.9) {
        System.out.printf("Seu imc é %.2f",imc);
        System.out.println();
        System.out.print("Você está acima do peso ideal");
        } else if (imc > 30) {
        System.out.printf("Seu imc é %.2f",imc);
        System.out.println();
        System.out.print("Você possui obesidade");
        }
        	
        sc.close();
        

	}

}
