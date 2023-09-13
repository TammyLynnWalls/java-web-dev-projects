package org.launchcode;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] practiceArray = {1, 1, 2, 3, 5, 8};
        String seusString = "I would not, could not, " +
                "in a box. I would not, could not with a " +
                "fox. I will not eat them in a house. I " +
                "will not eat them with a mouse." ;

                String[] seusArray = seusString.split(" ");
                String[] seusSentenceArray = seusString.split("//.");
                System.out.println(Arrays.toString(seusSentenceArray));




    }
}
