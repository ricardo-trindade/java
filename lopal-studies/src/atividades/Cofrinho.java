package exercicios;

import java.util.Scanner;

public class Cofrinho {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	double[] moedas = {0.01, 0.05, 0.1, 0.25, 0.5, 1};
		
	   System.out.println("Quantas moedas dos respectivos valores você tem?\nR$ 0,01\nR$ 0,05\nR$ 0,10\nR$ 0,25\nR$ 0,50\nR$ 1,00");
	   int quantidade;
	   double total = 0;
	   int semanas = 0;
	   
	   for (int i = 0; i < moedas.length; i++) {
	   quantidade = sc.nextInt();
	   total += moedas[i] * quantidade;
	   }
	   System.out.println("Total: R$" + total);
       
	   if (100 - total > 0) {
	   double falta = 100 - total;
	   System.out.println("Falta: "+falta+" para atingir R$ 100.");
       double saldoAtual = total;
       while (saldoAtual < 100) {
       saldoAtual += total;
       semanas++;
       }
       System.out.println("Você atingirá a meta de R$ 100 em " + semanas + " semana(s).");
	   } else {
	   System.out.print("Você atingiu a meta, parabéns!");
	   }
	   
	}

}
