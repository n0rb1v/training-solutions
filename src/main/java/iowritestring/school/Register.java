package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {
    public void newMark(Path f, int m) {
        try {
            if (Files.exists(f)) {
                Files.writeString(f, m + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(f, m + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }
    }

    public void average(Path f) {
        try {
            List<String> file = Files.readAllLines(f);
            double sum = 0;
            int count = 0;
            for (String item : file) {
                sum += Double.parseDouble(item);
                count++;
            }
            Files.writeString(f, "average: " + (sum / count), StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }
    }

}

