package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер одномерного массива: ");

        int size = scanner.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Введите %s элемент массива(положительное число): ".formatted(i + 1));
            try {
                int number = scanner.nextInt();
                if (number > 0) {
                    sum += number;
                    count++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Неверное значение!");
                scanner.nextLine();
            }
        }

        try {
            System.out.println("Среднее значение = %s".formatted(sum / count));
        } catch (ArithmeticException e) {
            System.out.println("Положительные элементы отсутствуют");
        }
    }
}