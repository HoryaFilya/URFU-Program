package lr1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String dayOfTheWeek = scanner.nextLine();

        System.out.print("Введите месяц: ");
        String month = scanner.nextLine();

        System.out.print("Введите число: ");
        String day = scanner.nextLine();

        System.out.println(
                """
                Дата.
                День недели: %s
                Число: %s
                Месяц: %s         
                        """.formatted(dayOfTheWeek, day, month));
    }
}