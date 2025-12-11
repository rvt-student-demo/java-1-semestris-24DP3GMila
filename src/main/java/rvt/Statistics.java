package rvt;

import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;
    private double average;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
        this.average = (double) sum / count;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return this.average;
    }

    public static void main(String[] args) {
        // Statistics statistics = new Statistics();
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        Scanner scanner = new Scanner(System.in);

        /*
         * * statistics.addNumber(3); * statistics.addNumber(5); *
         * statistics.addNumber(1); * statistics.addNumber(2);
         */ /*
             * * System.out.println("Count: " + statistics.getCount()); *
             * System.out.println("Sum: " + statistics.sum());
             */
        System.out.println("Enter numbers: ");
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }

            allNumbers.addNumber(number);

            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }

        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());

        scanner.close();
    }
}