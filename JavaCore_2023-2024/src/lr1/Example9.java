package lr1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.print("Введите кол-во дней в месяце: ");
        String countDay = scanner.nextLine();

        System.out.println("%s содержит %s дней".formatted(month, countDay));
    }
}

