package testetela;

import java.util.Random;
import java.util.Scanner;

public class AplicativoBancario {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
		
	    // Registro:
			
	    System.out.println("Olá Usuário! Vamos começar?");
		System.out.println("Digite seu nome de usuário no campo abaixo: ");
	    String criar_nome = sc.nextLine(); 
	    System.out.println();
			
		String regex = "^[a-zA-Z0-9._%+-]+@(outlook|gmail|hotmail|yahoo)\\.(com|com\\.br)$";
			
		 System.out.println("Digite seu e-mail no campo abaixo: ");
		 String usar_email = "";
		 while (true) {  
		 usar_email = sc.nextLine(); 
		 System.out.println();
			
		 
		 // E-mail:
		 
		 if (usar_email.matches(regex)) { 
	     break; 
	     } else {
	     System.err.println("E-mail inválido. Certifique-se de que o e-mail tenha um dos seguintes domínios: "
	     + "outlook, @gmail, @hotmail, @yahoo.com");
	     System.out.println("Tente novamente:");
	       }
		 }
		 
		 
		// Criar senha:
		 
		System.out.println("Crie uma senha:");
		String criar_senha = sc.nextLine();
		System.out.println();
			
		System.out.println("Conta Criada! Agora vamos ao login:");
			
		
			
		// Login
		
		String op;
	    
	    System.out.print("Você deseja logar usando seu e-mail ou seu nome de usuário? ");
		System.out.println("Se deseja usar o e-mail, digite 'e'");
		System.out.println("Se deseja usar o nome de usuário, digite 'n'");
		while (true) {
		op = sc.nextLine();
		System.out.println();
			
		if (op.equals("e") || op.equals("n")) {
	        break; 
	    } else {
	        System.err.println("Erro: Método de login inválido. Tente novamente:");
	    }
	    }

		// Login com e-mail:
			
		if (op.equals("e")) {
			
		System.out.println("Digite seu e-mail no campo abaixo: ");
		while (true) {     		 
		String email = sc.nextLine();
		System.out.println();
			
		if (email.equals(usar_email)) {
		break; 
		
	    } else { 
	    System.err.println("Este e-mail não existe ou está incorreto. Tente novamente: ");
	    }
		}
		}
		
		
		// Login com nome de usuário:
			
		if (op.equals("n")) {
				
		System.out.println("Digite seu nome de usuário no campo abaixo: ");
		while (true) {
		String nome = sc.nextLine();
		     
		if (nome.equals(criar_nome)) {
		System.out.println();
		break;
		
		} else {
		System.err.println("Este nome de usuário não existe ou está incorreto. Tente novamente: ");
		  }
		 }
		}
		
		System.out.println("Digite sua senha no campo abaixo: ");
	    while (true) {
		String senha = sc.nextLine();
		System.out.println();
		
			
		if (senha.equals(criar_senha)) {
		System.out.println("Login realizado com sucesso! Seja bem vindo, "+criar_nome+"!");
		System.out.println();
		break;
		} else { 
	    System.err.println("Senha incorreta. Tente novamente: ");
	    }
	    }
			
	    Random rd = new Random();
	    double saldo = rd.nextDouble(501) + 500;
	    double saque;
	    double dpst;
	    
	    while (true) {
	    
	    System.out.println("Qual operação bancária você deseja realizar?");
	    System.out.println("Para depósito, digite 'dp'");
	    System.out.println("Para saque, digite 'sq'");
	    System.out.println("Para consultar seu saldo, digite 'cs'");
	    System.out.println("Para sair, digite 'sair'");
	   
	    while (true) {
	    System.out.print("Operação: ");
	    String op1 = sc.nextLine();
	    System.out.println();
	      
	    // Consultar saldo:
	    
	    if (op1.equals("cs")) {
	    System.out.printf("Seu saldo é de %.2f\n", saldo);
	    System.out.println();
	    break;
	    }
	    
	    // Saque:
	    
	    if (op1.equals("sq")) {
	    System.out.printf("Saldo atual: %.2f\n", saldo);
	    System.out.println("Quanto você deseja sacar?");
	    while (true) {
	    saque = sc.nextDouble();
	    sc.nextLine();
	    
	    
	    if (saque > saldo) {
	    System.out.println();
	    System.err.println("Erro: saldo insuficiente para o valor que você queria sacar. Tente novamente:");
	    } if (saque <= saldo) {
	    System.out.println();
	    System.out.println("Saque realizado!");
	    System.out.printf("Novo saldo: %.2f\n", saldo - saque);
	    System.out.println();
	    saldo = saldo - saque;
	    break;
	    }
	    }
	    break;
	    }
	    
	    // Depósito
	    
	    if (op1.equals("dp")) {
	    System.out.printf("Saldo atual: %.2f\n", saldo);
	    System.out.println("Quanto você deseja depositar?");
	    dpst = sc.nextDouble();
	    System.out.println();
	    sc.nextLine();
	    System.out.println("Depósito realizado!");
	    System.out.printf("Novo saldo: %.2f\n", saldo + dpst);
	    System.out.println();
	    saldo = saldo + dpst;
	    break;
	    }
	    
        // Sair:
	    
	    if (op1.equals("sair")) {
	    System.out.println("Adeus! Volte sempre. ");
	    sc.close();
	    return;
	    }
	    
	    // Operação Inválida:
	    	
	    if (!op1.equals("sair") || !op1.equals("dp") || !op1.equals("sq") || !op1.equals("cs")) {
	    System.err.println("Erro: Operação inválida. Tente novamente:");
	    }
	  
	    }
	    
	    }
	    
 // Fim de classe
	    

	}

}
