package org.launchcode;
import java.util.Scanner;
public class MPG {
    public static void main (String[] args){
        Scanner ask = new Scanner(System.in);

        System.out.println("how many miles have you driven?: ");
        int miles = ask.nextInt();

        System.out.println("how many galons of gas did you use:? ");
        int gallon = ask.nextInt();

        int mpg = miles/gallon;
        System.out.println("Your car gets " + mpg + " miles per gallon" );
    }
}
