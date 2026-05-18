package com.geometry;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape:" +
                "\n 1. Circle" +
                "\n 2. Rectangle");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Shape circle = new Circle();
                circle.calculateArea();
                break;
            case 2:
                Shape rectangle = new Rectangle();
                rectangle.calculateArea();
        }
    }
}
