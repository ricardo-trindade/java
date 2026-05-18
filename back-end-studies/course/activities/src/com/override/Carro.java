package com.override;

public class Carro extends Veiculo {

    public Carro(double tamanho, String cor) {
        super(tamanho, cor);
    }

    @Override
    public void iniciar() {
        System.out.print("Carro ");
        super.iniciar();
    }
}
