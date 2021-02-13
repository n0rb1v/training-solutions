package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Attacker2 {
    private Map<String, Battle> stat = new HashMap<>();

    public void loadFile() { // Path.of("src/main/resources/);
        try (BufferedReader bf = Files.newBufferedReader(Path.of("src/main/resources/battles.txt"))) {
            String line = bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] result = line.split(",");
                processLine(result);

            }
        } catch (IOException e) {
            throw new IllegalStateException("file error");
        }
    }

    public Map<String, Battle> getStat() {
        return stat;
    }

    public void processLine(String[] sArray) {
        for (int i = 5; i < 13; i++) {
            String name = sArray[i];
            if (!name.isEmpty()) {
                Battle b = new Battle(name);
                if (!stat.containsKey(name)) {
                    stat.put(name, b);
                }
                stat.get(name).setCountpp();
            }
        }
    }

    public static void main(String[] args) {
        Attacker2 a = new Attacker2();
        a.loadFile();
        System.out.println(a.getStat());


    }
}
