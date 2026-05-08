package situacao.desafiadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Herois {

	public static void main(String[] args) {
		
		class Heroi {
			
		String nome;
		double forca, inteligencia, velocidade;
		Heroi(String nome, double forca, double inteligencia, double velocidade) {
		this.nome = nome;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.velocidade = velocidade;
		}
		
		}
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Heroi> herois = new ArrayList<>();
		
		while (true) {
		System.out.print("Digite o nome do herói ou fechar para fechar o programa: ");
		String nome = sc.nextLine();
        if (nome.equalsIgnoreCase("fechar")) {
        sc.close();
        break;
        }
			
		System.out.print("Força = ");
		double forca = sc.nextDouble();
		System.out.print("Nível de inteligencia (qi) = ");
		double inteligencia = sc.nextDouble();
		System.out.println("Velocidade (km/h) = ");
		double velocidade = sc.nextDouble();
		sc.nextLine();
		
		Heroi novoHeroi = new Heroi(nome, forca, inteligencia, velocidade);
		herois.add(novoHeroi);
	    

		System.out.println("\nHeróis cadastrados:");
		for (Heroi h : herois) {
		System.out.println(h.nome + " - Força: " + h.forca + ", Inteligência: " + h.inteligencia + ", Velocidade: " + h.velocidade + " km/h\n");
		}
		}
    }
}
