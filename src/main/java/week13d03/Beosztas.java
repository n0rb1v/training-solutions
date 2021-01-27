package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Beosztas {
    private List<Adat> adatList = new ArrayList<>();

    public void loadList(Path path) {
        try (BufferedReader bf = new BufferedReader(Files.newBufferedReader(path))) {
            String[] line = new String[4];
            while ((line[0] = bf.readLine()) != null) {
                adatList.add(loadAdat(bf,line));
            }
        } catch (IOException e) {
            throw new IllegalStateException("file error", e);
        }
    }

    private Adat loadAdat(BufferedReader bf, String[] strs) throws IOException {
        for (int i = 1; i < 4; i++) {
            strs[i] = bf.readLine();
        }
        return new Adat(strs[0],strs[1],strs[2],Integer.parseInt(strs[3]));
    }

    public int szumOraszam(String s){
        int sum = 0;
        for (Adat item: adatList){
            if (s.equals(item.getName())){
                sum += item.getOraszam();
            }
        }
        return sum;
    }
}
