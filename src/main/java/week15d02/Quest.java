package week15d02;

public class Quest {
    private String name;
    private String solution;
    private int point;
    private String theme;

    public Quest(String name, String solution, int point, String theme) {
        this.name = name;
        this.solution = solution;
        this.point = point;
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "name='" + name + '\'' +
                ", solution='" + solution + '\'' +
                ", point=" + point +
                ", theme='" + theme + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSolution() {
        return solution;
    }

    public int getPoint() {
        return point;
    }

    public String getTheme() {
        return theme;
    }
}
