package lr1;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int arg2 = scanner.nextInt();
        int arg1 = arg2 - 1;
        int arg3 = arg2 + 1;
        double arg4 = Math.pow(arg1 + arg2 + arg3, 2);

        System.out.println("%s, %s, %s, %s".formatted(arg1, arg2, arg3, arg4));
    }
}