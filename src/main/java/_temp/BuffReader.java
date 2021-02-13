package _temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BuffReader {
    public void loadFile(Path path) { // Path.of("src/main/resources/);
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] result = line.split(",");
            }
        } catch (IOException e) {
            throw new IllegalStateException("file error");
        }
    }

}
