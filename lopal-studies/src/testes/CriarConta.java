package CriarConta;

import java.util.Scanner;

public class CriarConta {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
		
		//Registro:
		
    System.out.println("Olá Usuário! Vamos começar?");
	System.out.println("Digite seu nome de usuário no campo abaixo: ");
    String criar_nome = sc.nextLine(); 
		
	String regex = "^[a-zA-Z0-9._%+-]+@(outlook|gmail|hotmail|yahoo)\\.(com|com\\.br)$";
		
	 System.out.println("Digite seu e-mail no campo abaixo: ");
	 String usar_email = "";
	 while (true) {  
	 usar_email = sc.nextLine(); 
		
	 
	   //E-mail:
	 
	   if (usar_email.matches(regex)) {
            System.out.println("E-mail válido!");
            break; 
       } else {
            System.err.println("E-mail inválido. Certifique-se de que o e-mail tenha um dos seguintes domínios: "
       + "outlook, @gmail, @hotmail, @yahoo.com");
       }
	 }
	 
	 
	  //Criar senha:
	 
	System.out.println("Crie uma senha:");
	int criar_senha = sc.nextInt();
		
	System.out.println("Conta Craida! Agora vamos ao login:");
		
	sc.nextLine();
		
	//Login

	System.out.print("Você deseja logar usando seu e-mail ou seu nome de usuário? ");
	System.out.println("Se deseja usar o e-mail, digite 'e'");
	System.out.println("Se deseja usar o nome de usuário, digite 'n'");
	String op = sc.nextLine();
		
	//Login com e-mail:
		
	if (op.equals("e")) {
		
	System.out.println("Digite seu e-mail no campo abaixo: ");
	while (true) {     		 
	String email = sc.nextLine();
		
	if (email.equals(usar_email)) {
    System.out.println();
	break; 
    } else { 
    System.err.println("Este e-mail não existe ou está incorreto. Tente novamente: ");
    }
	}
	}
		 
	//Login com nome de usuário:
		
	if (op.equals("n")) {
			
	System.out.println("Digite seu nome de usuário no campo abaixo: ");
	while (true ) {
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
	int senha = sc.nextInt();
	sc.nextLine();
		
	if (senha == criar_senha) {
	System.out.println();
	System.out.println("Login realizado com sucesso! Seja bem vindo, "+criar_nome+"!");
	break;
	} else { 
    System.err.println("Senha incorreta. Tente novamente: ");
    }
    }
		
    sc.close();
		

	}

}
