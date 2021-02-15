package _gyakorlas;

public class Gyak1cov {
    private String week;
    private int cases;

    public Gyak1cov(String week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    @Override
    public String toString() {
        return week + ':' + cases;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }
}
