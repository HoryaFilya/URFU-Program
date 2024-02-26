package lr1;

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String lastname = scanner.nextLine();

        System.out.print("Введите имя: ");
        String firstname = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String patronymic = scanner.nextLine();

        System.out.println("Hello %s %s %s!".formatted(lastname, firstname, patronymic));
    }
}