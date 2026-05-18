package com.bank;

public class ContaPessoaJuridica extends Conta {
    private static final double tarifa = 20.00;
    private static final double taxaSaque = 1.5;

    public ContaPessoaJuridica(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public void sacar(double valorSaque) {
        double valorTotalSaque = valorSaque + taxaSaque;
        if (valorSaque > 0) {
            if (saldo > valorTotalSaque) {
                saldo -= valorTotalSaque;
                System.out.println("Saque de R$ " + valorSaque +
                        " + " + taxaSaque + "realizado");
            } else {
                System.out.println("Saldo insificiente para saque");
            }
        } else {
            System.out.println("O saldo precisa ser positivo");
        }
    }

    @Override
    public void calcularTarifaMensal() {
        if (saldo >= tarifa) {
            saldo -= tarifa;
            System.out.println("Tarifa mensal de " + tarifa + "atribuída");
        } else {
            System.out.println("Saldo insificente. Não foi possível debitar a tarifa mensal");
        }
    }
}
