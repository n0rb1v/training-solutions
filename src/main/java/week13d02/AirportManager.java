package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirportManager {
    List<Airport> aList = new ArrayList<>();

    public void loadList(Path path) {
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] tmp = line.split(" ");
                String[] tim = tmp[3].split(":");
                int h =Integer.parseInt(tim[0]);
                int m =Integer.parseInt(tim[1]);
                Airport a = new Airport(tmp[0], tmp[1], tmp[2], LocalTime.of(h,m));
                aList.add(a);
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public List<Airport> getaList() {
        return aList;
    }

    public String countAp(){
        int arr = 0;
        int dep =0;
        for (Airport item: aList){
            if (item.getIrany().equals("Arrival")){
                arr++;
            }else{
                dep++;
            }
        }
        return arr > dep ? "Arrival": "Departure";
    }

    public Airport AirportFind(String s){
        for (Airport item: aList){
            if (item.getJarat().equals(s)){
                return item;
            }
        }
        throw new IllegalArgumentException("not found");
    }

    public List<Airport> findByCity(String c, String t){
        List<Airport> result = new ArrayList<>();
        for (Airport item: aList){
            if (item.getVaros().equals(c)&&item.getIrany().equals(t)){
                result.add(item);
            }
        }
        return result;
    }

    public Airport findEarlier(){
        LocalTime min = LocalTime.of(23,59);
        Airport minA = null;
        for (Airport item: aList){
            if (item.getIdopont().isBefore(min)&&item.getIrany().equals("Departure")){
                min = item.getIdopont();
                minA = item;
            }
        }
        return minA;
    }
}
