import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short counter = 0;
        short count = scanner.nextShort();
        Map<Integer, Integer> map = new HashMap<>(count);

        for (short i = 0; i < count; i++) {
            Integer number = scanner.nextInt();

            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        for (Integer value : map.values()) {
            if (value >= 4) {
                counter += (value / 4);
            }
        }

        System.out.println(counter);
    }
}