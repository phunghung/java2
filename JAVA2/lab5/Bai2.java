package baitap.lab5;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap xau 1: ");
        String a = sc.nextLine();
        System.out.print("Nhap xau 2: ");
        String b = sc.nextLine();

        try {
            int n1 = Integer.parseInt(a);
            int n2 = Integer.parseInt(b);
            System.out.println(n1);
            System.out.println(n2);
            int sum = n1+n2;
            System.out.println("Tong = " + sum);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
