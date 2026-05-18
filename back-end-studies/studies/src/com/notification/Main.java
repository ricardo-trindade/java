package com.notification;

public class Main {

    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification();
        SmsNotification smsNotification = new SmsNotification();

        emailNotification.send();
        smsNotification.send();
    }
}
