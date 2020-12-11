package week07d03;

import java.util.List;

public class NumberList {
    public static boolean isIncreasing(List<Integer> numbers) {
        int prev = numbers.get(0);
        for (Integer item : numbers) {
            if (item >= prev) {
                prev=item;
            } else {
                return false;
            }
        }
        return true;
    }
}
