package lr3.part3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int number;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите число: ");

            number = scanner.nextInt();
        }

        translation(number);
    }

    private static void translation(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }

        if (n / 2 == 0) {
            System.out.print(1);
        } else if (n % 2 == 1) {
            translation(n / 2);
            System.out.print(1);
        } else {
            translation(n / 2);
            System.out.print(0);
        }
    }
}