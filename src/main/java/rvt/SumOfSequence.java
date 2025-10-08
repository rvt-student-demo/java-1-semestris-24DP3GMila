package rvt;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine()); 
        for (int i = 0; i != number; i = i + 1) {
           Integer sum_of_number = number + i;
        }
    }
}
