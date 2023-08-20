package org.launchcode;
import java.util.Scanner;
public class AliceStrings {
    public static void main(String[] args){

       String alice  = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she " +
                "had peeped into the book her sister was" +
                " reading, but it had no pictures or" +
                " conversations in it, ‘and what is the" +
                " use of a book,’ thought Alice ‘without" +
                " pictures or conversation?’";



        while(true) {

            System.out.println("Enter a term to search for in the exerpt: ");
            Scanner question = new Scanner(System.in);
            String term = question.nextLine();
            Integer index = alice.indexOf(term);
            Integer length = term.length();
            String updatedSentence = alice.replace(term, "BOO");

            if (alice.contains(term)){
                System.out.println(true);
                //print out index and length;
                System.out.println("The word is at index " + index + " and is " + length + " characters long");
                System.out.println(updatedSentence);
                //remove word from string;
                //pring sentence again
            }else {
                System.out.println(false);
            }

       }




    }

}
