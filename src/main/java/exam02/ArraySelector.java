package exam02;

import java.util.ArrayList;

public class ArraySelector {
    public String selectEvens(int[] numbers) {
        String result = "";
        for (int i = 0; i < numbers.length; i += 2) {
            result += numbers[i] + ", ";
        }
        if (result.isBlank()) {
            return "";
        }
        result = result.substring(0, result.length() - 2);
        return "[" + result + "]";
    }
}
