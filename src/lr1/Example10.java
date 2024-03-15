package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год рождения: ");
        int year = scanner.nextInt();

        System.out.println("Ваш возраст %s".formatted(LocalDate.now().getYear() - year));
    }
}