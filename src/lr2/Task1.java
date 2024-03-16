package lr2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        StringBuilder index = new StringBuilder();

        System.out.print("Введите размер массива: ");

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив: %s".formatted(Arrays.toString(array)));

        int minValue = array[0];

        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                index.append(i).append(" ");
            }
        }

        System.out.println("""
                Минимальное значение в массиве: %s
                Индексы элементов с минимальным значением: %s
                """.formatted(minValue, index)
        );
    }
}

