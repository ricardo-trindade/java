package com.batery;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Batery batery = new Batery(0);
        PowerBank powerBank = new PowerBank(0);

        EnergyObject currently = null;

        System.out.println("Welcome!");
        outerLoop: while (true) {
            while (currently == null) {
                System.out.println("What do you want to use?" +
                        "\n1. Batery" +
                        "\n2. PowerBank" +
                        "\n3. Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        currently = batery;
                        break;
                    case 2:
                        currently = powerBank;
                        break;
                    case 3:
                        System.out.println("Always come back");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Try again");
                        continue;
                }
            }

            System.out.println("What do you want to do?" +
                    "\n1. Recharge" +
                    "\n2. Discharge" +
                    "\n3. See batery percentage" +
                    "\n4. Back");

            while (true) {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        currently.recharge();
                        break;
                    case 2:
                        currently.discharge();
                        break;
                    case 3:
                        System.out.println(currently.getBateryPercentage() + "%");
                        break;
                    case 4:
                        currently = null;
                        continue outerLoop;
                    default:
                        System.out.println("Invalid choice. Try again");
                        continue;
                }

                break;
            }
        }
    }
}
