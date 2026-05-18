package com.staff;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a role: " +
                "\n1. Manager" +
                "\n2. Seller");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Manager manager = new Manager("Fulano",10000);
                System.out.println("Type the bonus percentage: ");
                double bonus = input.nextDouble();
                manager.calculateBonus(bonus);
                break;
            case 2:
                Seller seller = new Seller("Fulano",5000);
                System.out.println("Type the income tax percentage: ");
                double incomeTax = input.nextDouble();
                seller.calculateLiquidWage(incomeTax);
                break;
        }
    }
}
