package week11d01;

import java.util.ArrayList;
import java.util.List;

public class DivisorFinder {
    public int findDivisors(int n) {
        String number = "" + n;
        List<Integer> numbers = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < number.length(); i++) {
            numbers.add(Integer.parseInt(number.substring(i, i + 1)));
        }
        for (Integer item : numbers) {
            if (n % item == 0) {
                index++;
            }
        }
        return index;

    }
}
