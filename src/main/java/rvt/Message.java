import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        // Ierakstam lietotāja ievadi kā String
        Scanner scanner = new Scanner(System.in);
        // Konvertējam String ievadi kā String

        String input = scanner.nextLine();
        
        System.out.println(input + 2);

        int inputAsInt = Integer.valueOf(input);

        scanner.close();
    

    }
}
