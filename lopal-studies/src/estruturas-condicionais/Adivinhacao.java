package Desafio;

import java.util.Scanner;

import java.util.Random;

public class Adivinhação {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Random rd = new Random();
		
        System.out.print("Adivinhe o número (entre 0 e 100, apenas inteiros): ");
        int n = sc.nextInt();
        
        int rdn = rd.nextInt(100);
        
        if (n == rdn) {
        System.out.print("Parabéns! Você acertou o número");
        System.out.println("O número era: " + rdn);
        } else if (Math.abs(n - rdn) <= 5) {
        System.out.println("Você quase acertou o número");
        System.out.println("O número era: " + rdn);
        } else {
        System.out.println("Você não acertou o número");
        System.out.println("O número era: " + rdn);
        }
		
		sc.close();
		
		
		
	}

}
