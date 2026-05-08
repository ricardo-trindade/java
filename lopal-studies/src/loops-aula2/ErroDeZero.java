package Loop;

import java.util.Scanner;

public class ErroDeZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os números: ");
		while (true) {
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double div = n1 / n2;
	
		if (n2 == 0) {
			
		System.err.println("Erro: divisão por zero. Tente novamente: ");
		} else {
		 
		System.out.println("Resultado = "+div);
		break;
		
		}
		
	
			
     		}
		
    	}
	}


