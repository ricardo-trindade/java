package com.bank;

abstract class Conta {

    protected int numero;
    protected String agencia;
    protected String titular;
    protected double saldo;

    public Conta(int numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
        } else {
            System.err.println("Valor do depoósito deve ser positivo");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque > 0) {
            if (saldo > valorSaque) {
                saldo -= valorSaque;
            } else {
                System.err.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Valor do saque deve ser positivo");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ "+saldo);
    }

    abstract void calcularTarifaMensal();



}
