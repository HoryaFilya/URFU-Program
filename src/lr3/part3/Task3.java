package lr3.part3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Введите элементы массива:");
            inputArray(array, 0, scanner);

            System.out.print("Введенный массив: ");
            outputArray(array, 0);
        }
    }

    public static void inputArray(int[] array, int index, Scanner scanner) {
        if (index < array.length) {
            System.out.print("Введите элемент " + (index + 1) + ": ");
            array[index] = scanner.nextInt();
            inputArray(array, index + 1, scanner);
        }
    }

    public static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index]);
            outputArray(array, index + 1);
        }
    }
}