package com.geometry;

import java.util.Scanner;

public class Circle extends Shape {

    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
