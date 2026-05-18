package com.bank;

public class BankingAccount {

    protected String holder;
    protected int balance;

    public BankingAccount(String holder, int balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("insufficient balance");
        } else {
            this.balance -= amount;
        }
    }


}
