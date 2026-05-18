package com.vehicles;

import com.override.Veiculo;

public class Bike extends Veiculo {

    public Bike(String modelo, float velocidade) {
        super(modelo, velocidade);
    }

    @Override
    public float calcularTempo(float distancia) {
        float velocidade = 20.0f;
        return distancia / velocidade;
    }

}
