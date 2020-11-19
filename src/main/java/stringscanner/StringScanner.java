package stringscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringScanner {
    public int readAndSumValues(String intString, String delimiter) {
        if (intString == null || intString.isBlank() || delimiter == null || delimiter.equals("")) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        int sum = 0;
        try (Scanner scanner = new Scanner(intString).useDelimiter(delimiter)) {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("Incorrect parameter string!", ex);
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        if (intString == null || intString.isBlank()) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        int sum = 0;
        try (Scanner scanner = new Scanner(intString)) {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("Incorrect parameter string!", ex);
        }
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (text == null || text.isBlank() || word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        try (Scanner scanner = new Scanner(text)) {
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()){
                String s = scanner.nextLine();
                if (s.contains(word)){
                    sb.append(s+"\n");
                }
            }
            return sb.toString().trim();
        }
    }

}
