package kelvin;

import java.util.Scanner;

public class Kelvin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String nome;
		String op;
		String novo_nome;
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		
		while (true) {
		System.out.println("Olá, " + nome);
		System.out.print("Quer alterar seu nome? (s/n) ");
		sc.nextLine();
		while (true) {
		op = sc.nextLine();
			
		
		if (op.equals("S") && op.equals("s")) {
		System.out.println("Digite seu novo nome");
		while (true) {
        novo_nome = sc.nextLine();
		
		if (!novo_nome.equals("nome")) {
	    nome = novo_nome;
	    break;
	    
	    
		} else {	
		System.err.print("Erro: o novo nome de usuário é igual ao antigo. Tente novamente: ");
		}
	  }
    }
		
		
		
		if (op.equals("N") && op.equals("n")) {
		System.out.println("Voltando para a tela inicial...");
		break;
		}
			
		if (!op.equals("N") && !op.equals("n") && !op.equals("S") && !op.equals("s")) {
		System.err.println("Erro: operação inválida. Tente novamente: ");
		}
		}
			
			
			
	}
  }

}
