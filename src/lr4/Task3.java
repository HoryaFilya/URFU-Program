package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер одномерного массива: ");

        int size = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Введите %s элемент массива: ".formatted(i + 1));
            try {
                int number = scanner.nextByte();
                sum += number;
            } catch (InputMismatchException e) {
                System.out.println("Неверное значение!");
                scanner.nextLine();
            }
        }

        System.out.println("Сумма = %s".formatted(sum));
    }
}