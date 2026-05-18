package com.week;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WeekDays today = null;

        while (true) {
            WeekDays.daysOptions();
                today = WeekDays.fromNumber();
            System.out.println(today.mensage());
        }
    }
}


