package week15d04;

import java.time.LocalDate;

public class CovidData {
    private String date;
    private String week;
    private int cases;
    private int death;
    private String country;

    public CovidData(String date, String week, int cases, int death, String country) {
        this.date = date;
        this.week = week;
        this.cases = cases;
        this.death = death;
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    public int getDeath() {
        return death;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "CovidData{" +
                "date='" + date + '\'' +
                ", week='" + week + '\'' +
                ", cases=" + cases +
                ", death=" + death +
                ", country='" + country + '\'' +
                '}';
    }
}
