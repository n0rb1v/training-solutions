package week12d03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NumberStat {
    private List<Integer> numbers;

    public NumberStat() {
        this.numbers = new ArrayList<>();
    }
    public NumberStat(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int xCount() {
        if (numbers.size() < 1) {
            throw new IllegalArgumentException("hibas lista");
        }
        int[] xStat = new int[20];
        for (int item : numbers) {
            xStat[item]++;
        }
        for (int i = 0; i < xStat.length; i++) {
            if (xStat[i] == 1) {
                return i;
            }
        }
        throw new IllegalStateException("nincs ilyen");
    }

    public void readFromFile(String fileName) {
        Path path = Path.of(fileName);

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null){
                String[] temp = line.split(",");
                addLine(temp);
            }
        } catch (NoSuchFileException nsfe) {
            throw new IllegalArgumentException("hibas file", nsfe);
        } catch (IOException e) {
            throw new IllegalStateException("hiba");
        }
    }
    private void addLine(String[] temp){
        for (String item: temp){
            numbers.add(Integer.parseInt(item));
        }
    }
}
