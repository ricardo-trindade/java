package Loop;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double o1 = 8.5;
		double o2 = 7.0;
		double o3 = 9.0;
        double o4 = 6.0;
        double o5 = 8.0;
        double mo = (o1 + o2 + o3 + o4 + o5) / 5;
        
        double d1 = 9.0;
        double d2 = 8.0;
        double d3 = 9.5;
        double d4 = 7.0;
   		double d5 = 8.5;
   		double md = (d1 + d2 + d3 + d4 + d5) / 5;
   		
   		System.out.println("Média das notas objetivas: " + mo);
   		System.out.println("Média das notas discursivas: " + md);
   		
   		sc.close();
	}

}
