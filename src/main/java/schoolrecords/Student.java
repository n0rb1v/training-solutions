package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public double calculateAverage() {
        int i = 0;
        double sum = 0;
        for (Mark item : marks) {
            sum += item.getMarkType().getValue();
            i++;
        }
        return Math.round(sum / i * 100.0) / 100.0;
    }

    public double calculateSubjectAverage(Subject sub) {
        int i = 0;
        double sum = 0;
        for (Mark item : marks) {
            String s1= item.getSubject().getSubjectName();
            String s2= sub.getSubjectName();
            if (s1.equals(s2)) {
                sum += item.getMarkType().getValue();
                i++;
            }
        }
        return Math.round(sum / i * 100.0) / 100.0;
    }

    public boolean equals(Object o) {
        return true;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        if (mark==null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    private boolean isEmpty(String s) {
        if ("".equals(s)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name +" marks: "+ marks;
    }
}
