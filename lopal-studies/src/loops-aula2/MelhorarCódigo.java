package Loop;

import java.util.Scanner;

public class MelhorarCódigo {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double n1 = sc.nextInt();

        System.out.println("Digite a nota 2: ");
        double n2 = sc.nextInt();

        System.out.println("Digite a nota 3: ");
        double n3 = sc.nextInt();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 7);
            System.out.println("Aprovado!");
        
            System.out.println("Reprovado! Média: " + media);
        
        sc.close();

	}

}
