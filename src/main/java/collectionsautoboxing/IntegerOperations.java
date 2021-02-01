package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {
    public List<Integer> createList(int... i) {
        List<Integer> result = new ArrayList<>();
        for (int item : i) {
            result.add(item);
        }
        return result;
    }

    public int sumIntegerList(List<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;
    }

    public int sumIntegerObjects(int... i) {
        int sum = 0;
        for (int item : i) {
            sum += item;
        }
        return sum;
    }
}
