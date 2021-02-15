package _gyakorlas;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Gyak1 {
    private List<Gyak1cov> caseList = new ArrayList<>();


    public void loadFile(Path path) { // Path.of("src/main/resources/);
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line = bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] result = line.split(",");
                String week = result[1];
                int cases = Integer.parseInt(result[2]);
                if (result[4].equals("Hungary")) {
                    caseList.add(new Gyak1cov(week,cases));
                }


            }
        } catch (IOException e) {
            throw new IllegalStateException("file error");
        }
    }

    public List<Gyak1cov> sortList(){
        List<Gyak1cov> result = new ArrayList<>(caseList);
        result.sort(new Comparator<Gyak1cov>() {
            @Override
            public int compare(Gyak1cov o1, Gyak1cov o2) {
                return o1.getCases() - o2.getCases();
            }
        });
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        Gyak1 gy = new Gyak1();
        gy.loadFile(Path.of("src/main/resources/data.csv"));
        System.out.println(gy.sortList());
    }
}
