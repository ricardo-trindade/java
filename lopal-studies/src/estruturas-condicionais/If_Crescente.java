package LOPAL;

import java.util.Scanner;

public class If_Crescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		double n2 = sc.nextDouble();
		System.out.print("Digite o terceiro número: ");
		double n3 = sc.nextDouble();
		
		if (n1 > n2 && n2 > n3) {
		System.out.print(n3 + n2 + n1);
		
		} else if (n2 > n1 && n2 < n3) {
	    System.out.print(n1+", "+n2+", "+n3); 
	    
	    } else if (n2 < n1 && n2 < n3) {
	    System.out.print(n2+", "+n1+", "+", "+n3);
	    
	    } else if (n3 > n1 && n2 > n3) {
		System.out.print(n1+", "+n3+", "+n2);
        
	    } else if (n3 < n1 && n1 > n2) {
	    System.out.print(n2+", "+n3+", "+n1);
		
	    } else if (n2 > n1 && n1 < n3) {
		System.out.print(n3+", "+n1+", "+n2);
	    }
		
	}

}
