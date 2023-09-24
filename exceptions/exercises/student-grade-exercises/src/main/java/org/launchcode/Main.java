package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Scanner input;
        input = new Scanner (System.in);
        System.out.println("Enter the student's points:\n");
        int x = input.nextInt();
        System.out.println("Enter the total possible points:\n");
        int y = input.nextInt();


        System.out.println("The grade for this assignment is: " + Divide(x,y)*100
        + "%");

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "MyCode.javascript");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        for (Map.Entry<String,String> entry : studentFiles.entrySet()) {

            System.out.println("\n" + entry.getKey() +"'s points are: " );
            System.out.println(CheckFileExtension(entry.getValue()));

        }
    }

    public static double Divide(int x, int y)
    {
        if(y == 0) {
            try{
                throw new ArithmeticException("Sorry, we cannot divide by zero.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        double result = (double)x/y;
        return result;
    }

    public static int CheckFileExtension(String fileName)
    {
        int pointsReceived = 1;

        if(!fileName.toLowerCase().endsWith(".java"))  {
            pointsReceived = 0;
        }

        if(fileName == null || fileName.equals("")) {
            try {
                throw new RuntimeException("This file is not accepted.");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            pointsReceived = -1;

        }

        return pointsReceived;
    }
}