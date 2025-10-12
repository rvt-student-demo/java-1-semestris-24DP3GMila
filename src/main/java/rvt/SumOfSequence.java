package rvt;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.println("Last number?");
        int n = scanner.nextInt();

        int summ = 0; // variable to store the sum

        // Use a loop to add numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            summ += i; // same as sum = sum + i
        }

        // Print the result in the same format as the example
        System.out.println("The sum is " + summ);

        scanner.close();
    }
}
