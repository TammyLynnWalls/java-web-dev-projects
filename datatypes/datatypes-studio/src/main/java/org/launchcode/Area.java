package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter a radius:");

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+ radius + " is: " + area);

    }
}
