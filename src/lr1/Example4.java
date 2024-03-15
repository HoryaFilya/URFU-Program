package lr1;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number: ");

            int num = scanner.nextInt();

            System.out.println("Your number: " + num);
        }
    }
}