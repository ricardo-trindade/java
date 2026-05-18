package com.thermometer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Thermometer thermometer = new Thermometer();

        mainLoop: while (true) {
            System.out.println("Choose an action:" +
                    "\n1. Check temperature" +
                    "\n2. Increase temperature" +
                    "\n3. Decrease temperature" +
                    "\n4. Quit");
            tryAgain:  while (true) {
                char choice = sc.nextLine().charAt(0);

                switch (choice) {
                    case '1':
                        System.out.println(thermometer.getTemperature() + "º");
                        break;
                    case '2':
                        thermometer.increaseTemperature();
                        break;
                    case '3':
                        thermometer.decreaseTemperature();
                        break;
                    case '4':
                        System.out.println("Always come back");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice, try again");
                        continue tryAgain;
                }

                break;
            }
        }
    }
}
