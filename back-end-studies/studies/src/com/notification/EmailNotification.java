package com.notification;

public class EmailNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending email");
    }
}
