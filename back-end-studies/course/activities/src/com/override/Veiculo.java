package com.override;

public class Veiculo {

    private double tamanho;
    private String cor;

    public Veiculo(double tamanho, String cor) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void iniciar() {
        System.out.print("está iniciando");
    }



}
