package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LenghtMax {
    private List<Varosok> citys = new ArrayList<>();

    public void createList(String fileName) {
        Path file = Path.of("src/main/resources/" + fileName);

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] tmp = line.split(";");
                Varosok v = new Varosok(tmp[0], tmp[1].trim());
                citys.add(v);
            }
        } catch (IOException e) {
            throw new IllegalStateException("file hiba", e);
        }

    }

    public String findCityMax() {
        int max = 0;
        String result = "";
        for (Varosok item : citys) {
            if (item.getTelep().length() > max) {
                max = item.getTelep().length();
                result = item.getTelep();
            }
        }
        return result;
    }

    public List<Varosok> getCitys() {
        return citys;
    }

}
