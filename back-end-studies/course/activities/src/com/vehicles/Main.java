package com.vehicles;

import com.override.Carro;
import com.override.Veiculo;

public class Main {

    public static void main(String[] args) {
        float distancia = 100.0f;

        Onibus onibus = new Onibus("Mercedes", 30, 20);
        Carro carro = new Carro("Uno", 70);
        Bike bike = new Bike("Caloi", 10);

        Veiculo[] veiculos = {onibus, carro, bike};

        for (Veiculo v : veiculos) {
            float tempo = v.calcularTempo(distancia);
            System.out.print(v.getModelo() + " leva " + tempo + " horas pra percorrer " + distancia + " km." );
            System.out.println();
        }


    }
}
