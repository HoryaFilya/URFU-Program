package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите год рождения: ");
        int year = scanner.nextInt();

        System.out.println("Имя: %s, возраст: %s".formatted(name, LocalDate.now().getYear() - year));
    }
}