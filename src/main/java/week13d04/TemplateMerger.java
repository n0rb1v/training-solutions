package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {
    public String merge(Path file, List<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(Files.newBufferedReader(file))) {
            String line = bf.readLine();
            for (Employee item : employees) {
                String tmp = line.replace("{nev}", item.getName()).replace("{ev}", item.getYear());
                sb.append(tmp + "\n");


            }
        } catch (IOException e) {
            throw new IllegalStateException("file hiba", e);
        }
        return sb.toString();
    }
}
