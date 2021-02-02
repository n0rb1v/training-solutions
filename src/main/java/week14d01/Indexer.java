package week14d01;

import java.util.*;

public class Indexer {
    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> result = new HashMap<>();
        for (String item : names) {
            char key = item.toUpperCase().charAt(0);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(item);
        }

        return result;
    }
}
