package rvt;

import java.util.Scanner;

public class Message_1 {
    public static void main(String[] args) {
        // Ierakstam lietotāja ievadi kā String
        Scanner scanner = new Scanner(System.in);
        // Konvertējam String ievadi kā String
        String input = scanner.nextLine();
        
        System.out.println(input + 2);

        scanner.close();
    

    }
}
