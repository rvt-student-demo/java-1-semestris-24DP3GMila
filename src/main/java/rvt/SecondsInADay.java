package rvt;

import java.util.Scanner;

public class SecondsInADay {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("How many days would you like to convert into seconds?");
    int number = Integer.valueOf(scanner.nextLine());
    int calculation = number * 60 * 60 * 24; //formula to calculate seconds into days
    System.out.println(calculation);

    scanner.close();
 }   
}
