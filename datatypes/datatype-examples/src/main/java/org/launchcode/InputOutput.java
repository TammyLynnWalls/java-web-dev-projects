package org.launchcode;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How you doin?");
        String name = input.nextLine();
        System.out.println("So you're" + name);

    }


}
