package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {
    public void writeTemperatures(Temperatures temperatures, String pathStr) {
        Path file = Path.of(pathStr);
        try {
            Files.write(file, temperatures.getData());
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }
    }
}
