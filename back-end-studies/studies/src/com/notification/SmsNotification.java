package com.notification;

public class SmsNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending SMS");
    }
}
