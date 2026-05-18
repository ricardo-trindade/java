package com.bank;

public class ContaCorrente extends Conta {
    private static final double TARIFA = 12.00;

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        super (numero, agencia, titular, saldo);
    }

    @Override
    void calcularTarifaMensal() {
        double tarifa = 12;
        if (saldo <= 0) {
            System.err.println("Saldo insuficiente");
        } else {
            for (Meses i : Meses.values()) {
                saldo = saldo - tarifa;
            }
        }

    }
}
