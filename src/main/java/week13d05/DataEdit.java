package week13d05;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class DataEdit {
    public int SumOfLetters(String s) {
        Set<Character> characterSet = new HashSet<>();
        String tmp = s.toLowerCase();

        for (Character item : tmp.toCharArray()) {
            if (isEnglishChar(item)){
                characterSet.add(item);
            }
        }
        return characterSet.size();
    }

    private boolean isEnglishChar(char c) {
        return (c >= 'a' && c <= 'z');
    }
}
