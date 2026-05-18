package com.payment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome! How do you want to pay?" +
                    "\n1. Pix" +
                    "\n2. Card");
            int userInput = sc.nextInt();
            sc.nextLine();
            switch (userInput) {
                case 1:
                    System.out.println("Payment method chosen: pix");
                    PixPayment pix = new PixPayment();
                    pix.process();
                    break;
                case 2:
                    System.out.println("Payment method chosen: card");
                    CardPayment card = new CardPayment();
                    card.process();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
