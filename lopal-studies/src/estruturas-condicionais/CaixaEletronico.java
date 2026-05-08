package Desafio;

import java.util.Random;
import java.util.Scanner;

public class CaixaEletrônico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("Qual operação bancária você deseja realizar?");
        System.out.println("Para depósito, digite 'dp'");
        System.out.println("Para saque, digite 'sq'");
        System.out.println("Para consultar seu saldo, digite 'cs'");
        System.out.print("Operação: ");
        String op = sc.nextLine();
        
        double saldo = rd.nextDouble(501) + 500;
          
        if (op.equals("cs")) {
        System.out.printf("Seu saldo é de R$ %.2f", saldo);
      
        } else if (op.equals("dp")) {
	    System.out.printf("Seu saldo é de R$ %.2f", saldo);
	    System.out.println();
	    System.out.print("Quanto você deseja depositar? ");
	    double dpst = sc.nextDouble();
	    System.out.printf("Saldo atual: %.2f", + saldo + dpst);
	   
        } else if (op.equals("sq")) {
	    System.out.printf("Seu saldo é de R$ %.2f", saldo);
	    System.out.println();
	    System.out.print("Quanto você deseja sacar? ");
	    double saque = sc.nextDouble();
	    System.out.printf("Saldo atual: %.2f", + saldo - saque);
	    }
	    
        sc.close();
	
	
	
	
	
	
	}

}
