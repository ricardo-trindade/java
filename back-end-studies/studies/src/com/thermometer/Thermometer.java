package com.thermometer;

public class Thermometer {

    protected int temperature;

    public Thermometer() {
        this.temperature = 23;
    }

    void increaseTemperature() {
        this.temperature = temperature + 1;
        System.out.println("The temperature is now: " + this.temperature + "º");
    }

    void decreaseTemperature() {
        this.temperature = temperature - 1;
        System.out.println("The temperature is now: " + this.temperature + "º");
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Thermometer temperature = " + temperature;
    }
}
