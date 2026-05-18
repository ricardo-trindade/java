package com.vehicles;

import com.override.Veiculo;

public class Onibus extends Veiculo {

    private int numero_paradas;

    public Onibus(String modelo, float velocidade, int numero_paradas) {
        super(modelo, velocidade);
        this.numero_paradas = numero_paradas;
    }

    public int getNumero_paradas() {
        return numero_paradas;
    }

    public void setNumero_paradas(int numero_paradas) {
        this.numero_paradas = numero_paradas;
    }

    @Override
    public float calcularTempo(float distancia) {
        float velocidade = 60.0f;
        float tempo = distancia / velocidade;
        float tempoParadas = (float) ((numero_paradas * 15.0f) / 80.0f);
        return tempo + tempoParadas;
    }
}
