package exercicios.da.aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		class Candidato {
		String nome;
		int votos;
		
	    Candidato(String nome) {
		this.nome = nome;
		this.votos = 0;
		}
		}

		ArrayList<Candidato> candidatos = new ArrayList<>();
		
		while (true) {
		System.out.print("Digite o nome do candidato (ou 'fim' para encerrar): ");
		String nome = sc.nextLine();
	    if (nome.equalsIgnoreCase("fim")) {
		break;
		}
		Candidato novoCandidato = new Candidato(nome);
		candidatos.add(novoCandidato);
		}

		if (candidatos.isEmpty()) {
		System.out.println("Nenhum candidato foi cadastrado. Encerrando programa.");
		sc.close();
		return;
		}

		
		System.out.println("Votação iniciada");
		while (true) {
		System.out.println("\nCandidatos:");
		for (int i = 0; i < candidatos.size(); i++) {
		System.out.println((i + 1) + " - " + candidatos.get(i).nome);
		}

		System.out.print("Digite o número do candidato para votar (ou 'fim' para encerrar): ");
		String entrada = sc.nextLine();

		if (entrada.equalsIgnoreCase("fim")) {
		break;
		}

	    try {
		int voto = Integer.parseInt(entrada);
		if (voto >= 1 && voto <= candidatos.size()) {
		candidatos.get(voto - 1).votos++;
		} else {
		System.err.println("Erro: número inválido.");
		}
		} catch (NumberFormatException e) {
		System.out.println("Entrada inválida.");
		}
		}

		int totalVotos = 0;
		for (Candidato c : candidatos) {
		totalVotos += c.votos;
		}

		System.out.println("\nResultado da votação:");
		if (totalVotos == 0) {
		System.out.println("Nenhum voto registrado.");
		} else {
		for (Candidato c : candidatos) {
		double porcentagem = (double) c.votos * 100 / totalVotos;
		System.out.printf("Candidato %s recebeu %d votos (%.2f%%)%n", c.nome, c.votos, porcentagem);
		}
		}

		sc.close();
	}
}
