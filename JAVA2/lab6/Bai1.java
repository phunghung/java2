package baitap.lab6;

import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        
        myList.add(2019);
        myList.add("Hung");
        myList.add(66.9);
        myList.add(true);
        
        for(int i = 0; i < 4; i++) {
            System.out.println(myList.get(i));
        }
    }
}
