package week05d03;

import java.util.List;

public class ListCounter {
    public int countZero(List<String> slist) {
        int sum = 0;
        for (String item : slist) {
            if ((item.charAt(0) == 'a')||(item.charAt(0) == 'A')) {
                sum++;
            }
        }
        return sum;
    }
}
