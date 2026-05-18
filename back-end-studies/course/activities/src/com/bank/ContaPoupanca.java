package com.bank;

public class ContaPoupanca extends Conta {
private static final double tarifa = 0.00;

    public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    void calcularTarifaMensal() {
        System.out.println("Essa conta não possui tarifa mensal");
    }
}
