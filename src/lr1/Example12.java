package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println("Ваш возраст: %s".formatted(LocalDate.now().getYear() - age));
    }
}