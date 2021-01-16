package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {
    public List<String> wordsWithChar(List<String> words, char c) {
        List<String> result = new ArrayList<>();

        for (String item : words) {
            if (item.indexOf(c) > -1) {
                result.add(item);
            }
        }
        return result;
    }
}
