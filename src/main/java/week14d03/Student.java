package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    Map<String, List<Integer>> jegyek = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void jegyBe(String targy, int jegy) {
        if (!jegyek.containsKey(targy)) {
            jegyek.put(targy, new ArrayList<>());
        }
        jegyek.get(targy).add(jegy);
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getJegyek() {
        return jegyek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", jegyek=" + jegyek +
                '}';
    }
}
