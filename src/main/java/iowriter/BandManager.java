package iowriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {
    private List<Band> bands = new ArrayList<>();

    public void readBandsFromFile(Path file) {
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tmp = line.split(";");
                Band b = new Band(tmp[0], Integer.parseInt(tmp[1]));
                bands.add(b);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }

    public void writeBandsBefore(Path file, int year) {
        try (BufferedWriter bw = Files.newBufferedWriter(file)) {
            for (Band item : olderThan(year)) {
                bw.write(item.getName() + " " + item.getYear() + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file", e);
        }
    }

    private List<Band> olderThan(int year) {
        List<Band> result = new ArrayList<>();
        for (Band item : bands) {
            if (item.getYear() < year) {
                result.add(item);
            }
        }
        return result;
    }
}
