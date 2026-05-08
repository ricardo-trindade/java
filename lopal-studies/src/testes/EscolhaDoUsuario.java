package Módulo1;

import java.util.Scanner;

public class EscolhaDoUsuário {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite seu segundo número: ");
        double n2 = sc.nextDouble();

        sc.nextLine();

        double adição = n1 + n2;
        double subtração = n1 - n2;
        double multiplicação = n1 * n2;
        double divisão = n1 / n2;
        double média = (n1 + n2) / 2;
        double hipotenusa = Math.sqrt(n1 * n1 + n2 * n2);
        double sobra = n1 % n2;
        double raíz2_n1 = Math.sqrt(n1);
        double raíz2_n2 = Math.sqrt(n2);

        System.out.println("Escolha sua operação: ");
        System.out.println("Para adição, digite '+' ");
        System.out.println("Para subtração, digite '-' ");
        System.out.println("Para multiplicação, digite '*' ");
        System.out.println("Para divisão, digite '/' ");
        System.out.println("Para média, digite 'm' ");
        System.out.println("Para hipotenusa, digite 'h' ");
        System.out.println("Para sobra, digite: 's' ");
        System.out.println("Para raízes quadradas, digite 'r' ");
        System.out.print("Operação escolhida: ");
        String operação = sc.nextLine();

        if (operação.equals("+")) {
            System.out.printf("A adição de seus números é: %.2f", adição);
        }

        if (operação.equals("-")) {
            System.out.printf("A subtração de seus números é: %.2f", subtração);
        }

        if (operação.equals("*")) {
            System.out.printf("A multiplicação de seus números é: %.2f", multiplicação);
        }

        //Divisão
        if (operação.equals("/")) {
        if (n2 == 0) {
        System.err.println("Erro: não é possível dividir por 0.");
        } else {
        System.out.printf("A divisão de seus números é: %.2f\n", divisão);
        }
        }
        

        if (operação.equals("m")) {
        System.out.printf("A média entre seus números é: %.2f", média);
        }

        if (operação.equals("h")) {
        System.out.printf("A hipotenusa de seus números é: %.2f", hipotenusa);
        }

        //Sobra
        if (operação.equals("s")) {
        if (n2 == 0) { 
        System.err.println("Erro: não é possível calcular a sobra por 0.");
        } else {
        System.out.printf("A sobra de divisão de seus números é: %.2f\n", sobra);
        }
        }

        
        //Raízes quadradas
        
        if (operação.equals("r")) {
        System.out.printf("A raíz quadrada do primeiro número é %.2f\n", raíz2_n1);
        System.out.printf("A raíz quadrada do segundo número é %.2f", raíz2_n2);
        }
        
        
        sc.close();







	}

}
