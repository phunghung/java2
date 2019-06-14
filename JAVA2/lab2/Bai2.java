package baitap.lab2;

import java.util.Scanner;

public class Bai2 {

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

        try {
            System.out.print("A[6] = ");
            A[6] = sc.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vuot qua pham vi mang " + e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
