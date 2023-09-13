package org.launchcode;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList= new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        int sum = 0;

        for(int integer: myArrayList) {
            if(integer % 2 == 0){
                sum+= integer;
            }

        }
        System.out.println(sum);
    }
}
