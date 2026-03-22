/**
 * Name: Mason Ford
 * Date: 2026-03-21
 * Assignment: SDC230 Performance Assessment - Smallest Number
 * Description: This program asks the user how many integers they will enter,
 * then determines and prints the smallest value entered.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Title
        System.out.println("Mason Ford - Week 2 PA Smallest Number\n");
        System.out.println("Finding the Smallest Value:");

        // Ask how many numbers
        System.out.print("How many integers would you like to enter: ");
        int count = scanner.nextInt();

        int smallest = 0;

        // Loop through user inputs
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter an integer value: ");
            int num = scanner.nextInt();

            // First iteration sets smallest
            if (i == 1) {
                smallest = num;
            } else {
                if (num < smallest) {
                    smallest = num;
                }
            }
        }

        // Output result
        System.out.println("The smallest value entered is: " + smallest);

        scanner.close();
    }
}