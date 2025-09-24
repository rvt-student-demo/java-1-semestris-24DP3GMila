package rvt;

import java.util.Scanner;

public class ThreeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int third_number = Integer.valueOf(scanner.nextLine());
        double result = (first_number + second_number + third_number) * 1.0 / 3;
        System.out.println("Average number is: " + result);

        scanner.close();
    }
}
