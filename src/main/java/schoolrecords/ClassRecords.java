package schoolrecords;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student stu) {
        boolean succ = false;
        if (!students.contains(stu.getName())) {
        students.add(stu);
        succ = true;
        }
        return succ;
    }

    public boolean removeStudent(Student stu) {
        boolean succ = false;
        if (!students.contains(stu.getName())) {
        } else {
            students.remove(stu);
            succ = true;
        }
        return succ;
    }

    public double calculateClassAverage() {
        int i = 0;
        double sum = 0;
        for (Student item : students) {
            sum += item.calculateAverage();
            i++;
        }
        return Math.round(sum / i * 100.0) / 100.0;
    }

    public double calculateClassAverageBySubject(Subject sub) {
        int i = 0;
        double sum = 0;
        for (Student item : students) {
            double diff = item.calculateSubjectAverage(sub);
            if (diff != 0.0) {
                sum += diff;
                i++;
            }
        }
        return Math.round(sum / i * 100.0) / 100.0;

    }


    public Student findStudentByName(String s) {
        return new Student("a");
    }


    public String getClassName() {
        return className;
    }

    private boolean isEmpty(String s) {
        if ("".equals(s)) {
            return true;
        }
        return false;
    }

    public String listStudentNames() {
        return "";
    }

//    public List<StudyResultByName> listStudyResults(){
//    }


    public Student repetition() {
        return new Student("a");
    }

    public List<StudyResultByName> listStudyResults() {
        return null;
    }
}
