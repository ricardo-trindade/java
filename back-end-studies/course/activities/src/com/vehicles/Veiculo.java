package com.vehicles;

public class Veiculo {

    private String modelo;
    private float velocidade;

    public Veiculo(String modelo, float velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float calcularTempo(float distancia) {
        return 0;
    }
}
