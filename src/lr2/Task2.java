package lr2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.print("Введите длину строки массива: ");

        int lineLength = scanner.nextInt();

        System.out.print("Введите длину столбца массива: ");

        int columnLength = scanner.nextInt();

        int[][] array = new int[lineLength][columnLength];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = counter++;
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = counter++;
                }
            }
        }

        System.out.println("Массив:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("%s ".formatted(array[i][j]));
            }
            System.out.println();
        }
    }
}