package baitap.lab1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();
        
        double dientich = Math.PI*Math.pow(r, 2);
        double chuvi = 2*Math.PI*r;
        
        System.out.println("Dien tich hinh tron: " + dientich);
        System.out.println("Chu vi hinh tron: " + chuvi);
    }
}
