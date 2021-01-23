package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {
    public Temperatures readTemperatures(String pathStr) {
        Path file = Path.of(pathStr);
        try {
            byte[] data = Files.readAllBytes(file);
            return new Temperatures(data);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }

    }
}
