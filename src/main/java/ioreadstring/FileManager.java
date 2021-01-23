package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private Path file;
    List<Human> humans = new ArrayList<>();

    public FileManager(String file) {
        this.file = Path.of(file);
    }

    public Path getMyFile() {
        return file;
    }

    public List<Human> getHumans() {
        return new ArrayList<>(humans);
    }

    public void readFromFile() {
        try {
            List<String> fileInString = Files.readAllLines(file);
            for (String item : fileInString) {
                String s[] = item.split(" ");
                Human h = new Human(s[0], s[1]);
                humans.add(h);
            }

        } catch (IOException e) {
            throw new IllegalStateException("file hiba", e);
        }
    }
}
