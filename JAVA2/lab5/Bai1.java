package baitap.lab5;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = sc.nextInt();
        
        System.out.println(Math.sqrt((double)a));
        System.out.println(Math.pow(a, b));
        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Min: " + Math.min(a, b));
        
    }
}
