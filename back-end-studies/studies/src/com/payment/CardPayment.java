package com.payment;

import java.util.Scanner;

public class CardPayment implements Payment {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Debit or credit?");
        String cardTransactionType = sc.nextLine();
        if (cardTransactionType.equalsIgnoreCase("debit")) {
            System.out.println("Selected: debit" +
                    "\n\n" +
                    "Insertion or approximation?");
            String isertionOrAproximation = sc.nextLine();
            if (isertionOrAproximation.equalsIgnoreCase("approximation")) {
                System.out.println("Payment completed");
            } else if (isertionOrAproximation.equalsIgnoreCase("insertion")) {
                System.out.println("Put your card password: ");
                String cardPassword = sc.nextLine();
                System.out.println("Payment completed");
            }
        } else if (cardTransactionType.equalsIgnoreCase("credit")) {
            System.out.println("Selected: credit" +
                    "\n\n" +
                    "Insertion or approximation?");
            String isertionOrAproximation = sc.nextLine();
            if (isertionOrAproximation.equalsIgnoreCase("approximation")) {
                System.out.println("Payment completed");
            } else if (isertionOrAproximation.equalsIgnoreCase("insertion")) {
                System.out.println("Put your card password: ");
                String cardPassword = sc.nextLine();
                System.out.println("Payment completed");
            }
        }
    }
}

