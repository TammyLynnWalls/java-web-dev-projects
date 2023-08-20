package org.launchcode;

import java.util.Scanner;

public class NumericTypesB {
    public static void main (String[] args) {
        Scanner askNumber = new Scanner(System.in);
        System.out.println("Give length of rectangle");
        int length = askNumber.nextInt();
        System.out.println("Give width of rectangle");
        int width = askNumber.nextInt();
        int area = length * width;
        System.out.println("Your rectangle's area is: " + area);
    }
}
