package Jobsheet8;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            String expr = "";
            for (int j = 1; j <= i; j++) {
                sum += j * j;
                expr += (j == 1 ? "" : " + ") + (j * j);
            }
            System.out.println("n = " + i + " -> sum of squares = " + expr + " = " + sum);
        }
    }
}