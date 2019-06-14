package baitap.lab5;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so the sinh vien: ");
        String sothe = sc.nextLine();
        System.out.println(CardNumber(sothe));
    }

    public static boolean CardNumber(String card) {
        int sum = 0;
        String[] temp = card.split(" ");      
        for(String s : temp) {
            char[] ch = s.toCharArray();
            int len = ch.length;
            for(int i = 0; i < len; i++) {
                String t = Character.toString(ch[i]);
                sum += Integer.valueOf(t);
            }
        }
        if(sum % 2 == 0) {
            return true;
        }
        return false;
    }
}
