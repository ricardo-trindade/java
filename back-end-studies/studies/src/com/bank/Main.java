package com.bank;

import javax.smartcardio.Card;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankingAccount account1 = new BankingAccount("Fulano", 0);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");
        while (true) {
            System.out.println("What do you want to do?" +
                    "\n1. See balance" +
                    "\n2. Deposit" +
                    "\n3. Withdraw" +
                    "\n4. Exit");
            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println(account1.getBalance());
                    break;
                case 2:
                    System.out.println("How much do you want to deposit?");
                    account1.deposit(sc.nextInt());
                    break;
                case 3:
                    System.out.println("How much do you want to withdraw?");
                    account1.withdraw(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Come back often!");
                    System.exit(0);
            }
        }
    }
}
