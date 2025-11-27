package rvt;

import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skruvju skaits: ");
        int skruvji = Integer.valueOf(scanner.nextLine());
        System.out.println("Uzgrieznu skiats: ");
        int uzgriezni = Integer.valueOf(scanner.nextLine());
        System.out.println("Paplaksnu skiats: ");
        int paplaksni = Integer.valueOf(scanner.nextLine());
        int total = (skruvji * 5) + (uzgriezni * 3) + paplaksni;
        System.out.println("Kopeja cena: " + total);
        scanner.close();
    }
}
