package Desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class NúmerosIlimitados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> al = new ArrayList<>();
		
		System.out.print("Quantos números você deseja usar? ");
        int qn = sc.nextInt();
        
        for (int inicio = 1; inicio <= qn; inicio++) {
            System.out.print("Digite o número " + inicio + ": ");
            double num = sc.nextDouble();
            al.add(num);
          }
        
        sc.close();
        
        
        }

}
