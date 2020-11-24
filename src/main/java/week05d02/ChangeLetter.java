package week05d02;

public class ChangeLetter {
    private static final String VOWEL = "aeiou";
    private static final String REP = "*";

    public String changeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        String c = "";

        for (int i = 0; i < s.length(); i++) {
            c = s.substring(i, i + 1);
            if (VOWEL.contains(c)) {
                sb.append(REP);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
