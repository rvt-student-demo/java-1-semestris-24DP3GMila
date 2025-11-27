package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();
        System.out.println("Ievadi cenu: ");
        int cena = Integer.valueOf(scanner.nextLine());
        System.out.println("Express piegade (0 = ne, 1 = ja): ");
        int piegade = Integer.valueOf(scanner.nextLine());
        if (piegade == 1) {
            piegade += 4;
        } else {
            piegade += 0;
        }
        int kopa = cena + piegade;
        System.out.println("Rekins: ");
        System.out.println(prece + ": " + cena);
        System.out.println("Piegade: " + piegade);
        System.out.println("Kopa: " + kopa);
        scanner.close();
    }
}
