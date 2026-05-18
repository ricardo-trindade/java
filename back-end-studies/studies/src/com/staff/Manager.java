package com.staff;

public class Manager extends Staff {

    public Manager(String name, double wage) {
        super(name, wage);
    }

    void calculateBonus(double bonusPercentage) {
        double bonus = wage + ((wage / 100) * bonusPercentage);
        System.out.println("Initial wage: " + wage +
                "\nNew wage: " + bonus);
    }
}
