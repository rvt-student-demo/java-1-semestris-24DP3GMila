package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        WordTriangle();
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

        System.out.print("Enter cook time -> ");
        String input = scanner.nextLine().trim();

        String minutes;
        String seconds;

        if (input.length() <= 2) {
            minutes = "0";
            seconds = input;
        } else {
            seconds = input.substring(input.length() - 2);
            minutes = input.substring(0, input.length() - 2);
        }

        if (seconds.length() == 1) {
            seconds = "0" + seconds;
        }

        System.out.println("Your time -> " + minutes + ":" + seconds);

        scanner.close();
    }

    public static void DocumentaionPrinter() {
        Scanner scanner = new Scanner(System.in);

        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.trim().startsWith("//")) {
                System.out.println(line);
            }
        }

        scanner.close();
    }

    public static void BetterDocumentationPrinter() {
        Scanner scanner = new Scanner(System.in);

        boolean inBlockComment = false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

            if (inBlockComment) {
                System.out.println(line);

                if (line.startsWith("*/")) {
                    inBlockComment = false;
                }

            } 
            else { 
                // Outside block comment

                if (line.startsWith("//")) {
                    System.out.println(line);
                } else if (line.startsWith("/*")) {
                    System.out.println(line);
                    inBlockComment = true;
                } else if (line.startsWith("*/")) {
                    System.out.println(line);
                }
            }
        }

        scanner.close();
    }

    public static void PasswordChecker() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            if (password.length() >= 7) {

                if (!password.equals(password.toLowerCase())) {

                    if (!password.equals(password.toUpperCase())) {

                        boolean hasDigit = false;
                        for (int i = 0; i < password.length(); i++) {
                            if (Character.isDigit(password.charAt(i))) {
                                hasDigit = true;
                                break;
                            }
                        }

                        if (hasDigit) {
                            System.out.println("Acceptable password.");
                            break;
                        }
                    }
                }
            }

            System.out.println("That password is not acceptable.\n");
        }

        scanner.close();
    }

    public static void WordTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word --> ");
        String word = scanner.nextLine();

        int spaces = 0;
        int length = word.length();

        while (length > 0) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            System.out.println(word.substring(0, length));

            spaces++;
            length -= 2;
        }

        scanner.close();
    }
}
