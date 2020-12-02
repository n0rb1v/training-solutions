package week06d03;

public class WordEraser {
    public String eraseWord(String words, String word) {
        String[] s1 = words.split(" ");
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].equals(word)) {
                s2.append(s1[i]+" ");
            }
        }
        return s2.deleteCharAt(s2.length()-1).toString();
    }
}
