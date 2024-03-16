package lr2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");

        String text = scanner.nextLine();

        System.out.print("Введите ключ: ");

        int shift = scanner.nextInt();

        char[] arrayChar = text.toCharArray();
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayCharNew[i] = (char) (arrayChar[i] + shift);
        }

        System.out.println("Текст после преобразования: %s".formatted(new String(arrayCharNew)));
        System.out.print("Выполнить обратное преобразование? (y/n)");

        scanner.nextLine();
        String answer = scanner.nextLine();

        switch (answer) {
            case "y" -> System.out.println("Текст после обратного преобразования: %s".formatted(text));
            case "n" -> System.out.println("До свидания!");
            default -> System.out.println("Введите корректный ответ");
        }
    }
}