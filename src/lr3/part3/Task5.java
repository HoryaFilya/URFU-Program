package lr3.part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        StringBuilder keyMoreFive = new StringBuilder();
        List<String> keyEqualsZero = new ArrayList<>();
        int counter = 0;
        long result = 1;

        for (int i = 1; i < 11; i++) {
            map.put(i, "String_%s".formatted(i));
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                result *= entry.getKey();
                counter++;
            }

            if (entry.getKey() > 5) {
                keyMoreFive.append("%s ".formatted(entry.getValue()));
                continue;
            }

            if (entry.getKey() == 0) {
                keyEqualsZero.add(entry.getValue());
            }
        }

        System.out.println("Map: %s".formatted(map));
        System.out.println("Строки с key > 5: %s".formatted(keyMoreFive));
        System.out.println("Строки с key = 0: %s".formatted(keyEqualsZero.isEmpty() ? "Таких строк нет" : String.join(", ", keyEqualsZero)));
        System.out.println("Результат перемножения ключей, где длины строк > 5: %s".formatted(counter == 0 ? 0 : result));
    }
}