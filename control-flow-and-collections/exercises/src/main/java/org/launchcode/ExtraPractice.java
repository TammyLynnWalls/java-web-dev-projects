package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class ExtraPractice {
    public static void main(String[] args) {

        String quote = "A long descriptive name is better " +
                "than a short enigmatic name. A long " +
                "descriptive name is better than a long " +
                "descriptive comment.";

        HashMap<String, Integer> charCount = new HashMap<>();

        for (int i=0; i< quote.length();i++){
            char c = quote.charAt(i);
            String convertedChar = String.valueOf(c);

            if(!charCount.containsKey(convertedChar)){
                charCount.put(convertedChar,1);
            }

            if(charCount.containsKey(convertedChar)){
               int currentValue = charCount.get(convertedChar);
               int newValue = currentValue + 1;
               charCount.put(convertedChar, newValue);
            }

        }

        for(Map.Entry<String, Integer> entry: charCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
