package exercicios;

import java.util.Random;
import java.util.Scanner;

   public class PedraPapelTesoura {

		enum Jogo {
		PEDRA, PAPEL, TESOURA, LAGARTO, SPOCK;
		
		public boolean vence(Jogo pc) {
		switch (this) {
		case PEDRA:
		return pc == TESOURA || pc == LAGARTO;
		case PAPEL:
		return pc == PEDRA || pc == SPOCK;
		case TESOURA:
		return pc == PAPEL || pc == LAGARTO;
		case LAGARTO:
		return pc == PAPEL || pc == SPOCK;
		case SPOCK:
		return pc == PEDRA || pc == TESOURA;
	    default: 
	   	return false;
			}
		}
		public boolean empata(Jogo pc) {
		return this == pc;
			}
		}
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("Vamos jogar! Digite sua jogada:\nPedra\nPapel\nTesoura\nLagarto\nSpock");
		String entrada = sc.next().toUpperCase();
		
		try {
		
		Jogo jogador = Jogo.valueOf(entrada);
		Jogo computador = Jogo.values()[rd.nextInt(5)];
			
		System.out.println("Você escolheu: "+jogador+"\nComputador escolheu: "+computador);
		
		
		if (jogador.empata(computador)) {
		System.out.println("Empat");
		} else if (jogador.vence(computador)) {
		System.out.println("Parabéns, você venceu!");
		} else {
		System.out.println("Que pena, você perdeu! Não foi dessa vez");
		}
		} catch (IllegalArgumentException e) {
		System.err.println("Entrada inválida!");
		}
		sc.close();
   	}
}
