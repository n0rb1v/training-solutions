package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private List<Country> countries = new ArrayList<>();

    public void readFromFile(String fileName) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(
                CountryStatistics.class.getResourceAsStream("/" + fileName)))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] tmp = line.split(" ");
                Country c = new Country(tmp[0], Integer.parseInt(tmp[1]));
                countries.add(c);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public Country mostBorderCountries() {
        Country max = countries.get(0);
        for (Country item : countries) {
            if (item.getBorderCountries() > max.getBorderCountries()) {
                max = item;
            }
        }
        return max;
    }

    public int numberOFCountries() {
        return countries.size();
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(countries);
    }
}
