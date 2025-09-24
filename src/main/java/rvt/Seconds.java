package rvt;

import java.util.Scanner;

public class Seconds {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("How many days would you like to convert into seconds?");
    int number = Integer.valueOf(scanner.nextLine());
    int calculation = number * 60 * 60 * 24;
    System.out.println(calculation);
 }   
}
