package LOPAL;

import java.util.Scanner;

public class If_Bissexto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano (xxxx): ");
		int ano = sc.nextInt();
		
		if (ano % 4  == 0 && ano % 100 != 0 || (ano % 400 == 0)) {
	    System.out.print("O ano é bissexto");
		} else {
	    System.out.print("O ano não é bissexto");
		}

		sc.close();
		
		
	}

}
