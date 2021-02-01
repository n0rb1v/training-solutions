package collectionslist.lotto;

import java.util.*;

public class Draw {
    public Set<Integer> drawNumbers(int draw, int max) {
        if (max <= draw){
            throw new IllegalArgumentException("drawCount must be less then " + max + "!");
        }
        LinkedList<Integer> tmp = new LinkedList<>(createPool(max));
        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < draw; i++) {
            result.add(tmp.poll());
        }
        return result;
    }

    private List<Integer> createPool(int maxNumber) {
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i < maxNumber; i++) {
            result.add(i);
        }
        Collections.shuffle(result);
        return result;
    }
}
