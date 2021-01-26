package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {
    public void writeAsBytes(List<String> s, Path path) {
        try (BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(path))){
            for (String item: s){
                if (!item.startsWith("_")){
                    bos.write(item.getBytes(StandardCharsets.UTF_8));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }
    }
}
