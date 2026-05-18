package com.geometry;

import java.util.Scanner;

public class Rectangle extends Shape {


    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the height of the rectangle: ");
        double height = sc.nextDouble();
        System.out.println("Type the width of the rectangle: ");
        double width = sc.nextDouble();
        double area = height * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
