package com.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(1001, "001", "João Silva", 500.00);
        Conta cp1 = new ContaPoupanca(2002, "001", "Maria Oliveira", 1200.50);
        Conta cpj1 = new ContaPessoaJuridica(3003, "001", "Empresa XYZ", 3500.75);
        Scanner sc = new Scanner(System.in);

        Conta contaAtual = null;

        while (true) {
            System.out.println("Bem-vindo ao banco!" +
                    "\nEscolha uma conta:" +
                    "\n1. Conta Corrente" +
                    "\n2. Conta Poupança" +
                    "\n3. Conta Pessoa Jurídica " +
                    "\n4. Sair do programa");

            int escolhaConta = sc.nextInt();

            if (escolhaConta == 4) {
                System.out.println("Saindo do programa..." +
                        "\nVolte sempre!");
                break;
            }

            switch (escolhaConta) {

                case 1:
                    contaAtual = cc1;
                    System.out.println("Você selecionou a Conta Corrente de " + contaAtual.getTitular());
                    break;
                case 2:
                    contaAtual = cp1;
                    System.out.println("Você selecionou a Conta Poupança de " + contaAtual.getTitular());
                    break;
                case 3:
                    contaAtual = cpj1;
                    System.out.println("Você selecionou a Conta Pessoa Jurídica de " + contaAtual.getTitular());
                    break;
                default:
                    System.err.println("Opção inválida. Por favor, tente novamente.");
                    contaAtual = null;
                    continue;
            }

            if (contaAtual != null) {
                boolean continuarOperacoes = true;
                while (continuarOperacoes) {
                    System.out.println("O que deseja fazer? " +
                            "\n1. Depositar" +
                            "\n2. Sacar" +
                            "\n3. Ver saldo" +
                            "\n4. Avançar para o próximo mês e aplicar tarifas" +
                            "\n5. Sair da conta");
                    System.out.print("Sua escolha: ");
                    int escolhaOperacao = sc.nextInt();

                    switch (escolhaOperacao) {
                        case 1:
                            System.out.print("Digite o valor para depósito: ");
                            double valorDeposito = sc.nextDouble();
                            contaAtual.depositar(valorDeposito);
                            break;
                        case 2:
                            System.out.print("Digite o valor para saque: ");
                            double valorSaque = sc.nextDouble();
                            contaAtual.sacar(valorSaque);
                            break;
                        case 3:
                            contaAtual.exibirSaldo();
                            break;
                        case 4:
                            contaAtual.calcularTarifaMensal();
                            break;
                        case 5:
                            continuarOperacoes = false;
                            System.out.println("Voltando para a seleção de contas.");
                            break;
                        default:
                            System.err.println("Opção inválida. Tente novamente.");
                            break;
                    }
                }
            }
        }
    }
}
