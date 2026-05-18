package com.batery;

abstract class EnergyObject implements Rechargeable {

    protected int bateryPercentage;

    public EnergyObject(int bateryPercentage) {
        this.bateryPercentage = bateryPercentage;
    }

    public int getBateryPercentage() {
        return bateryPercentage;
    }

    public void setBateryPercentage(int bateryPercentage) {
        this.bateryPercentage = bateryPercentage;
    }
}
