package baitap.lab6;

import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        
        for(int i = 1; i <= 10; i++) {
            myArray.add(i);
        }
        
        for(int i = 0; i < 10; i++) {
            System.out.println(myArray.get(i));
        }
    }
}
