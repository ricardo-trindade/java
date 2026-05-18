package com.batery;

public class Batery extends EnergyObject {

    public Batery(int bateryPercentage) {
        super(bateryPercentage);
    }

    @Override
    public void recharge() {
        if (bateryPercentage >= 100) {
            System.out.println("The batery is full");
        } else {
            bateryPercentage = bateryPercentage + 1;
            System.out.println("Recharged: " + bateryPercentage + "%");
        }
    }

    @Override
    public void discharge() {
        if (bateryPercentage <= 0) {
            System.out.println("The batery is empty");
        } else {
            bateryPercentage = bateryPercentage - 1;
            System.out.println("Discharged: " + bateryPercentage + "%");
        }
    }
}
