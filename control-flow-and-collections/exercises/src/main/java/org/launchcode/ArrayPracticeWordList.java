package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeWordList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");

        String paragraph = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with " +
                "a mouse";

        String[] wordArray = paragraph.split("[\\s,.]");
        ArrayList<String> singleWordList = new ArrayList<>(Arrays.asList(wordArray));

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to check length or enter 0 to quit: ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            boolean foundWord = false;

            for(String word : singleWordList) {
                if (word.length()==number ){
                    System.out.println(word);
                    foundWord = true;

                }
            }
            if (!foundWord) {
                System.out.println("No words found");
            }

        }

        System.out.println("Bye bye");

    }
}
