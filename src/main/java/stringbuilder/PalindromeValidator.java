package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        String text = word.trim().toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.reverse();
        if (text.equals(sb.toString())) {
            return true;
        }
        return false;
    }
}
