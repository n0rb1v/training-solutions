package iofilestest;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CheeseManager {
    public void saveToFile(Path path, List<Cheese> cheeses) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new BufferedOutputStream(Files.newOutputStream(path)))) {
            for (Cheese item : cheeses) {
                osw.write(item.getName() + ";" + item.getLaktoz() + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }
    }

    public Cheese findCheese(Path path, String name) {
        try (BufferedReader bf = new BufferedReader(Files.newBufferedReader(path))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] tmp = line.split(";");
                if (name.equals(tmp[0])) {
                    Cheese c = new Cheese(tmp[0], Double.parseDouble(tmp[1]));
                    return c;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
        return null;
    }
}
