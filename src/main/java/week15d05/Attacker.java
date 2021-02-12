package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Attacker {
    private List<Battle> battleList = new ArrayList<>();

    public Map<String, Integer> loadFile() {
        try (BufferedReader bf = Files.newBufferedReader(Path.of("src/main/resources/battles.txt"))) {
            String line = bf.readLine();
            Map<String, Integer> result = new HashMap<>();

            while ((line = bf.readLine()) != null) {
                String[] split = line.split(",", 14);
                int bnumber = Integer.parseInt(split[2]);
                for (int i = 5; i < 13; i++) {
                    if (split[i].isEmpty()) break;
                    if (!result.containsKey(split[i])) {
                        result.put(split[i], 1);
                    }else{
                        result.put(split[i], result.get(split[i])+1);
                    }

                }
            }
            return result;

        } catch (IOException e) {
            throw new IllegalStateException("file error", e);
        }
    }


    public List<Battle> getBattleList() {
        return battleList;
    }


    public static void main(String[] args) {
        Attacker a = new Attacker();
        System.out.println(a.loadFile());
    }
}
