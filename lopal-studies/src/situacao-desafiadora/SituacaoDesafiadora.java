package situacao.desafiadora;

import java.util.Scanner;

public class SituacaoDesafiadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual seu salário bruto? ");
		double salarioBruto;
		while (true) {
		salarioBruto = sc.nextDouble();
		if (salarioBruto < 1518) {
		System.err.println("Erro: salário menor que o mínimo (R$ 1518,00). Tente novamente: ");
		} else {
	    break;
		}
		}
		System.out.print("Quantos dependentes você possui? ");
		int dependentes;
		while (true) {
		dependentes = sc.nextInt();
		if (dependentes < 0) {
		System.err.println("Erro: número de dependentes inválido. Tente novamente: ");
		} else {
		break;
		}
		}
        System.out.println("Qual o tipo do seu plano de saúde?\nNão possuo (digite n)\n1. Básico = R$ 500,00 (digite b)\n2. Intermediário = R$ 700,00 (digite i)\n3. Completo = R$ 900,00 (digite c)");
        sc.nextLine();
        int planoDeSaude;
        while (true) {
        String tipoPlanoDeSaude = sc.nextLine();
        if (tipoPlanoDeSaude.equalsIgnoreCase("n")) {
        planoDeSaude = 0;
        break;
        } else if (tipoPlanoDeSaude.equalsIgnoreCase("b")) {
        planoDeSaude = 500;
        break;
        } else if (tipoPlanoDeSaude.equalsIgnoreCase("i")) {
        planoDeSaude = 700;
        break;
        } else if (tipoPlanoDeSaude.equalsIgnoreCase("c")) {
        planoDeSaude = 900;
        break;
        } else {
        System.err.print("Erro: entrada inválida. Tente Novamente: ");
        }
        } 
        System.out.println("Você possui vale-transporte? (6% do salário bruto)\nSe sim, digite s\nSe não, digite n");
        double valeTransporte;
        while (true) {
        String vtSimOuNao = sc.nextLine();
        if (vtSimOuNao.equalsIgnoreCase("s")) {
        valeTransporte = 0.06 * salarioBruto;
        break;
        } else if (vtSimOuNao.equalsIgnoreCase("n")) {
        valeTransporte = 0;
        break;
        } else {
        System.out.println("Erro: entrada inválida. Tente novamente: ");
        }
        }
        System.out.println("Você possui vale-refeição? (5% do salário bruto)\nSe sim, digite s\nSe não, digite n");
        double valeRefeicao;
        while (true) {
        String vrSimOuNao = sc.nextLine();
        if (vrSimOuNao.equalsIgnoreCase("s")) {
        valeRefeicao = 0.05 * salarioBruto;
        break;
        } else if (vrSimOuNao.equalsIgnoreCase("n")) {
        valeRefeicao = 0;
        break;
        } else {
        System.err.println("Erro: entrada inválida. Tente novamente: ");
        }
        }
        System.out.println("Você possui vale-alimentação? (5% do salário bruto)\nSe sim, digite s\nSe não, digite n");
        double valeAlimentacao;
        while (true) {
        String vaSimOuNao = sc.nextLine();
        if (vaSimOuNao.equalsIgnoreCase("s")) {
        valeAlimentacao = 0.05 * salarioBruto;
        break;
        } else if (vaSimOuNao.equalsIgnoreCase("n")) {
        valeAlimentacao = 0;
        break;
        } else {
        System.err.println("Erro: entrada inválida. Tente novamente: ");
        }
        }
        
        double salarioLiquido = (salarioBruto - planoDeSaude - (planoDeSaude * dependentes) - valeTransporte - valeRefeicao - valeAlimentacao);
        double descontoSalarioBruto = salarioBruto - salarioLiquido;
        double percentualDesconto = (descontoSalarioBruto / salarioBruto) * 100;
        System.out.printf("Seu salário líquido é de R$ %.2f\n",salarioLiquido);
        System.out.printf("Desconto no salário: R$ %.2f, cerca de %.2f%%\n", descontoSalarioBruto, percentualDesconto);
        sc.close();
	}

}
