package lr4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] array = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        System.out.print("Введите номер столбца: ");

        try {
            int number = scanner.nextInt();
            int size = array.length;
            StringBuilder column = new StringBuilder();

            for (int i = 0; i < size; i++) {
                column.append(array[i][number - 1]).append(" ");
            }

            System.out.println("Столбец с номером %s: [ %s]".formatted(number, column));
        } catch (InputMismatchException e) {
            System.out.println("Неверное значение!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет столбца с таким номером!");
        }
    }
}