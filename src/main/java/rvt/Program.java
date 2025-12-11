package rvt;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.nextLine();
        System.out.println(message);
        scanner.close();
}

public static String getPetName () {
        // void - funkcija neatgriež NEKO
        return "Jerry";
    }
}
    