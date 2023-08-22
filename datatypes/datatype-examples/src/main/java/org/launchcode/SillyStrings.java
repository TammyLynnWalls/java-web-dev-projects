package org.launchcode;
import java.util.Scanner;
public class SillyStrings {
    public static void main(String [] args) {
        while (true){
            String originalString = "A vacation is when you take a trip to some" +
                    " adjective place with your family. " +
                    "Usually you go to some place that is near a/an noun.";

            Scanner input = new Scanner(System.in);

            System.out.print("Enter an adjective: ");

            String adjective = input.next();

            System.out.print("Enter a noun: ");

            String noun = input.next();

            String sillyString = originalString.replace("adjective", adjective);
            String sillyString2 = sillyString.replace("noun", noun);


            System.out.print(sillyString2);

        }




    }
}
