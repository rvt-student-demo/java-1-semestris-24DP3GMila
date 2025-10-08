package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number;

        while (true) {
            System.out.println("Give a number:");
            Number = scanner.nextInt();
            if (Number == 4) {
                break;
            }
        }
        scanner.close();
    }
}
