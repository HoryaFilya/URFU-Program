package lr1;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input name: ");
            String name = scanner.nextLine();

            System.out.print("Input age: ");
            int age = scanner.nextInt();

            System.out.print("Input height: ");
            float height = scanner.nextFloat();

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
        }
    }
}