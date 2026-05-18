package com.account;

public class Main {

    public static void main (String[] args) {

        User user = new User(1, "fulano", "fulano@gmail.com");
        User user1 = new User(2,"fulano");

        System.out.println(user);
        System.out.println(user1);

    }
}
