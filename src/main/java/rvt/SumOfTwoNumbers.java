package rvt;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second_number = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of numbers is " + (first_number + second_number));

        scanner.close();
    }
}
