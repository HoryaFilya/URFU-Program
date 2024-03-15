package lr1;

import java.util.Scanner;

public class Example13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите число: ");
        int number2 = scanner.nextInt();

        System.out.println("%s + %s = %s".formatted(number1, number2, number1 + number2));
    }
}