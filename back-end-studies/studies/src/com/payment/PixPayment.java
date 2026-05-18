package com.payment;

import java.util.Scanner;

public class PixPayment implements Payment {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How will you pay?" +
                "\n1. Read QR code" +
                "\n2. Type Pix key");
        String pixInput = sc.nextLine();
        if (pixInput.equals("1")) {
            System.out.println("Payment completed");
        } else if (pixInput.equals("2")) {
            System.out.println("Type the pix key");
            String pixKey = sc.nextLine();
            System.out.println("Payment completed");
        }
    }


}
