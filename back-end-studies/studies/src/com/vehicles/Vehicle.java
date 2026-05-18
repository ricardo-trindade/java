package com.vehicles;

abstract class Vehicle {

    protected String brand;
    protected double maximumSpeed;

    public Vehicle(String brand, double maximumSpeed) {
        this.brand = brand;
        this.maximumSpeed = maximumSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                '}';
    }
}
