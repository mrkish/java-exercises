package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius;
        System.out.println("What is the radius of the circle? Please enter only positive numbers: ");
        radius = in.nextFloat();
        while (radius < 0) {
            System.out.println("Sorry, that number is less than zero. Please enter a new number: ");
            radius = in.nextFloat();
        }
        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}