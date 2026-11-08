package Jobsheet8;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the value of n (min 3) = ");
            n = sc.nextInt();
        } while (n < 3);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print(n + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}