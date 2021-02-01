package collectionsset;

import java.util.Set;
import java.util.TreeSet;

public class WordFilter {

    public Set<String> filterWords(String[] randomStrings) {
        Set<String> orderedStrings = new TreeSet<>();
        for (String item : randomStrings) {
            orderedStrings.add(item);
        }
        return orderedStrings;
    }
}
