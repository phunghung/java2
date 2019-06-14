package baitap.lab2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        int[] A = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += A[i];
        }
        System.out.println("Sum: " + sum);
    }
}
