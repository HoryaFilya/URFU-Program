package lr3.part6;

import java.util.*;

public class Task {

    private static Deque<Integer> arrayDeque = new ArrayDeque<>();
    private static List<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Время выполнения операции добавления в начало arrayDeque = " + getRunningTimeAddingToFirst(arrayDeque));
        System.out.println("Время выполнения операции добавления в начало arrayList = " + getRunningTimeAddingToFirst(arrayList));

        System.out.println("Время выполнения операции удаления из начала arrayDeque = " + getRunningTimeRemovingToFirst(arrayDeque));
        System.out.println("Время выполнения операции удаления из начала arrayList = " + getRunningTimeRemovingToFirst(arrayList));

        System.out.println("Время выполнения операции добавления в конец arrayDeque = " + getRunningTimeAddingToLast(arrayDeque));
        System.out.println("Время выполнения операции добавления в конец arrayList = " + getRunningTimeAddingToLast(arrayList));

        System.out.println("Время выполнения операции удаления из конца arrayDeque = " + getRunningTimeRemovingToLast(arrayDeque));
        System.out.println("Время выполнения операции удаления из конца arrayList = " + getRunningTimeRemovingToLast(arrayList));

        System.out.println("Время выполнения операции добавления в середину arrayList = " + getRunningTimeAddingToMiddle(arrayList));

        System.out.println("Время выполнения операции удаления из середины arrayList = " + getRunningTimeRemovingToMiddle(arrayList));

        getRunningTimeAddingToLast(arrayDeque);
        getRunningTimeAddingToLast(arrayList);

        System.out.println("Время выполнения операции получения элемента по индексу (из конца коллекции) arrayDeque = " + getRunningTimeGetToLast(arrayDeque));
        System.out.println("Время выполнения операции получения элемента по индексу (из конца коллекции) arrayList = " + getRunningTimeGetToLast(arrayList));
    }

    private static long getRunningTimeAddingToFirst(Deque<Integer> queue) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            queue.addFirst(i);
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeAddingToFirst(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.addFirst(i);
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeRemovingToFirst(Deque<Integer> queue) {
        long start = System.currentTimeMillis();

        while (!queue.isEmpty()) {
            queue.removeFirst();
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeRemovingToFirst(List<Integer> list) {
        long start = System.currentTimeMillis();

        while (!list.isEmpty()) {
            list.removeFirst();
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeAddingToLast(Deque<Integer> queue) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            queue.addLast(i);
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeAddingToLast(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.addLast(i);
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeRemovingToLast(Deque<Integer> queue) {
        long start = System.currentTimeMillis();

        while (!queue.isEmpty()) {
            queue.removeLast();
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeRemovingToLast(List<Integer> list) {
        long start = System.currentTimeMillis();

        while (!list.isEmpty()) {
            list.removeLast();
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeAddingToMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(list.size() / 2, i);
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeRemovingToMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();

        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeGetToLast(Deque<Integer> queue) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            queue.getLast();
        }

        return System.currentTimeMillis() - start;
    }

    private static long getRunningTimeGetToLast(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.getLast();
        }

        return System.currentTimeMillis() - start;
    }
}