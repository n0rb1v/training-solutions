package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private static final Random rnd = new Random(5);

    public static List<Integer> getNumbers(int interval, int numbers) {
        List<Integer> finalNumbers = new ArrayList<>();
        for (int i = 0; finalNumbers.size() < numbers; i++) {
            Integer j = rnd.nextInt(interval)+1;
            if (!finalNumbers.contains(j)) {
                finalNumbers.add(j);
            }

        }
        return finalNumbers;
    }

}
