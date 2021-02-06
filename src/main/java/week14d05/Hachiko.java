package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Hachiko {
    private Path path;

    public Hachiko(Path path) {
        this.path = path;
    }

    public Map<String, Integer> countWords(String... s) {
        Map<String, Integer> result = new HashMap<>();
        try (BufferedReader bf = Files.newBufferedReader(path, Charset.forName("windows-1250"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                for (String item : s) {
                    putItemIf(result, line, item);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("file error", e);
        }
        return result;
    }

    private void putItemIf(Map<String, Integer> result, String line, String item) {
        if (line.contains(item)) {
            if (!result.containsKey(item)) {
                result.put(item, 0);
            }
            result.put(item, result.get(item) + 1);
        }
    }
}
