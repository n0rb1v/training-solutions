package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public static List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        for (String item : first) {
            if (second.contains(item)) {
                if (!result.contains(item)) {
                    result.add(item);
                }
            }
        }
        return result;
    }
}
