package iofilestest;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CheeseManager {
    public void saveToFile(Path path, List<Cheese> cheeses) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new BufferedOutputStream(Files.newOutputStream(path)))){
            for (Cheese item: cheeses){
                osw.write(item.getName()+";"+item.getLaktoz()+"\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }
    }

    public Cheese findCheese(Path path){
        return null;
    }
}
