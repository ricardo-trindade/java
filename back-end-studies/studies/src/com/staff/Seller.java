package com.staff;

public class Seller extends Staff {

    public Seller(String name, double wage) {
        super(name, wage);
    }

    void calculateLiquidWage(double incomeTax) {
        double liquidWage = wage - ((wage / 100) * incomeTax);
        System.out.println("Gross wage: " + wage +
                "\nLiquid wage: " + liquidWage);
    }
}
