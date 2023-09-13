package org.launchcode;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        //initialize scanner
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> studentIdNumbers = new HashMap<>();
        String name;

        System.out.println("please enter students or ENTER to quit: ");

        do {

            System.out.println("Name:");
            name = input.nextLine();

            if (!name.equals("")){
                System.out.println("ID Number:");
                Integer idNum = input.nextInt();
                studentIdNumbers.put(name, idNum);

                input.nextLine();
            }

        } while (!name.equals(""));

        input.close();


        System.out.println("Class names");

        for (String student: studentIdNumbers.keySet()){
            System.out.println(student);
        }

        System.out.println("Class names and Id Numbers");

        for(Map.Entry<String,Integer> student : studentIdNumbers.entrySet()){
            System.out.println("Name: " +student.getKey()+" "+"Id Number: "+student.getValue());
        }

        System.out.println("End of list");

    }
}
