package Jobsheet8;

import java.util.Scanner;

public class KopiSenja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of cafe branches: ");
        int branches = sc.nextInt();

        int grandCustomers = 0, grandItems = 0;

        System.out.println("\n=== Sales Input Per Branch ===");
        for (int b = 1; b <= branches; b++) {
            System.out.println("\n--- Branch " + b + " ---");
            System.out.print("Number of customers: ");
            int customers = sc.nextInt();

            int items = 0;
            for (int c = 1; c <= customers; c++) {
                System.out.print("- How many items did customer " + c + " order? ");
                items += sc.nextInt();
            }
            System.out.println("Branch " + b + ":");
            System.out.println("- Customers: " + customers);
            System.out.println("- Items sold: " + items);

            grandCustomers += customers;
            grandItems += items;
        }
        System.out.println("\nTotal across all branches:");
        System.out.println("Customers: " + grandCustomers);
        System.out.println("Items sold: " + grandItems);
    }
}
