package rvt;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int summ = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;

        // We don't know how many times the user will enter numbers,
        // so we create a for loop that runs indefinitely.
        for (;;) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }
            
            summ += number;
            count++;
            avg = (double) summ / count;

            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + summ);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        scanner.close();
    }
}
