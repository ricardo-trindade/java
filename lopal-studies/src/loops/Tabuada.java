package AlterarNome;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int n;
		
		System.out.print("Digite o número: ");
		n = sc.nextInt();
		
		do {
		System.out.println(n +" * "+ i +" = " +n+i);
		i++;
		
		} while (i < 10);
		
		sc.close();

	}

}
