import java.util.Scanner;

public class Task_1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short count = scanner.nextShort();
        scanner.nextLine();

        String[] array = new String[count];

        for (short i = 0; i < count; i++)
            array[i] = scanner.nextLine();

        String letter = scanner.nextLine();

        for (String str : array) {
            if (str.startsWith(letter))
                System.out.println(str);
        }
    }
}