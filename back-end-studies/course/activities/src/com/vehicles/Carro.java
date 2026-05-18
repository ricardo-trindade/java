package com.vehicles;

import com.override.Veiculo;

public class Carro extends Veiculo {

    public Carro(String modelo, float velocidade) {
        super(modelo, velocidade);
    }

    @Override
    public float calcularTempo(float distancia) {
        float velocidade = 80.0f;
        return distancia / velocidade;
    }


}
