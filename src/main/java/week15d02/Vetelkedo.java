package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Vetelkedo {
    private List<Quest> kerdesek = new ArrayList<>();

    public Vetelkedo() {
        readFile();
    }

    private void readFile() {
        try (BufferedReader bf = Files.newBufferedReader(Path.of("src/main/resources/kerdesek.txt"))) {
            String line, line2;
            while ((line = bf.readLine()) != null) {
                line2 = bf.readLine();
                String[] tmp = line2.split(" ");
                kerdesek.add(new Quest(line, tmp[0], Integer.parseInt(tmp[1]), tmp[2]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("file error", e);
        }
    }

    public List<String> temaKerdesek(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("tema hiba");
        }
        List<String> result = new ArrayList<>();
        for (Quest item : kerdesek) {
            if (item.getTheme().equals(s)) {
                result.add(item.getName());
            }
        }
        return result;
    }

    public Quest randomKerdes() {
        List<Quest> result = new ArrayList<>(kerdesek);
        Collections.shuffle(result, new Random(5));
        return result.get(0);
    }

    public Map<String, List<Quest>> rendezes() {
        Map<String, List<Quest>> result = new HashMap<>();
        for (Quest item : kerdesek) {
            if (!result.containsKey(item.getTheme())) {
                result.put(item.getTheme(), new ArrayList<>());
            }
            result.get(item.getTheme()).add(item);
        }
        return result;
    }

    public String legtobb() {
        Map<String, List<Quest>> temp = rendezes();
        Map<Integer, String> temp2 = new HashMap<>();
        for (String item : temp.keySet()) {
            temp2.put(szumma(temp.get(item)), item);
        }
        return temp2.get(Collections.max(temp2.keySet()));
    }

    private int szumma(List<Quest> q) {
        int sum = 0;
        for (Quest item : q) {
            sum += item.getPoint();
        }
        return sum;
    }

    public static void main(String[] args) {
        Vetelkedo v = new Vetelkedo();
        System.out.println(v.temaKerdesek("matematika"));
        System.out.println(v.randomKerdes());
        System.out.println(v.rendezes());
        System.out.println(v.legtobb());
    }
}
