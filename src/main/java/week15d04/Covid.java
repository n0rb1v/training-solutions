package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Covid {
    private List<CovidData> cdl = new ArrayList<>();

    public void loadFile() {
        try (BufferedReader bf = Files.newBufferedReader(Path.of("src/main/resources/data.csv"))) {
            String line = bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] split = line.split(",", 6);
                if (split[4].equals("Hungary")) {
                    CovidData cd = new CovidData(
                            split[0],
                            split[1],
                            Integer.parseInt(split[2]),
                            Integer.parseInt(split[3]),
                            split[4]);
                    cdl.add(cd);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File hiba");
        }
    }

    public List<CovidData> getSorted() {
        List<CovidData> result = new ArrayList<>(cdl);
        Collections.sort(result, new Comparator<CovidData>() {
            @Override
            public int compare(CovidData o1, CovidData o2) {
                return o1.getCases() - o2.getCases();
            }
        });
        Collections.reverse(result);
        return result;


    }

    public List<CovidData> getCdl() {
        return cdl;
    }

    public static void main(String[] args) {
        Covid c = new Covid();
        c.loadFile();
        System.out.println(c.getSorted().get(0));
    }
}
