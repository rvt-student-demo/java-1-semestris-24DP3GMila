package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class JMArrayList {
    public static void main(String[] args) {
        onTheList();
    }

    public static void onlyTheseNumbers() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int Num = 0;
        System.out.println("Give a number!");
        while (true) {
            if (Num == -1) {
                break;
            }
            Num = Integer.valueOf(scanner.nextInt());
            listOfNumbers.add(Num);
        }
        // šeit būs turpinājums vēlāk
        for (int i = 0; i < listOfNumbers.size(); i++) {
            int numbers = listOfNumbers.get(i);
            System.out.println(numbers);

            scanner.close();
        }
    }

    public static void listSize() {
        ArrayList<String> listOfNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String Name = scanner.nextLine();
            if (Name.isEmpty()) {
                break;
            }
            listOfNames.add(Name);
        }
        System.out.println("In total: " + listOfNames.size());

        scanner.close();
    }

    public static void onTheList() {
        ArrayList<String> listOfNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String Name = scanner.nextLine();
            if (Name.isEmpty()) {
                break;
            }
            listOfNames.add(Name);
        }
        System.out.println("Seching for? ");
        String search = scanner.nextLine();

        if (listOfNames.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found.");
        }

        scanner.close();
    }

    public static void removeLast(ArrayList<String> strings) {

    }
}
