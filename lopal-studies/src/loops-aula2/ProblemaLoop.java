package Loop;

import java.util.Scanner;

public class ProblemaLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int n = sc.nextInt();
		int r = n;
		
        for (int i = 0; i < 5; i++) {
	    r = (r + n) * 2;
	    
	    }
		  
		System.out.println("Resultado final: " + r);
		
		sc.close();
			
		}
	}


