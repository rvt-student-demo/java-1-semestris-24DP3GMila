package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        TitleApplier();
    }

    public static void NameEcho() {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine().trim(); // remove leading trailing spaces

        int spaceIndex = fullName.indexOf(" ");

        if (spaceIndex <= 0) {
            System.out.println(fullName);
        } else {
            String firstName = fullName.substring(0, spaceIndex);
            String lastName = fullName.substring(spaceIndex + 1);
            lastName = lastName.toUpperCase();
            System.out.println(firstName + " " + lastName);
        }

        scanner.close();

    }

    public static void charAt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        for(int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
        scanner.close();
    }

    public static void TitleApplier() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a name:");
            String name = scanner.nextLine().trim();

            if (name.length() == 0) {
                break;
            }
            String titledName = name;
            if (name.startsWith("Amy") ||
            name.startsWith("Buffy") ||
            name.startsWith("Cathy")) {
                titledName = "Ms." + name;
            } else if (name.startsWith("Elroy")||
            name.startsWith("Fred")||
            name.startsWith("Graham")) {
                titledName = "Mr." + name;
            }

            System.out.println(titledName);
            scanner.close();
        }
    }

    public static void MicrowaveMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cook time ->");
        String input = scanner.nextLine().trim();
        String minutes;
        String seconds;
        if (input.length() <= 2) {
            minutes = "0";
            seconds = input;
        } else{
            seconds = input.substring();
        }

    }

    public static void DocumentaionPrinter() {

    }

    public static void BetterDocumentationPrinter() {

    }

    public static void PasswordChecker() {

    }

    public static void WordTriangle() {

    }
}
