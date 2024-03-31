package lr3.part3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество человек: ");

        int count = scanner.nextInt();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        play(count, arrayList);
        play(count, linkedList);
    }

    private static void play(int count, List<Integer> list) {
        long start = System.currentTimeMillis();

        int indexStart = 1;

        for (int i = 1; i <= count; i++) {
            list.add(i);
        }

//        System.out.println("%s: %s".formatted(list.getClass().getSimpleName(), list));

        while (list.size() != 1) {
            int size = list.size();

            for (int i = indexStart; i < list.size(); i += 1) {
                list.remove(i);
            }

            if ((size - indexStart) % 2 == 0) {
                indexStart = 0;
            } else {
                indexStart = 1;
            }

//            System.out.println(list);
        }

        System.out.println("%s time: %s".formatted(list.getClass().getSimpleName(), System.currentTimeMillis() - start));
    }
}