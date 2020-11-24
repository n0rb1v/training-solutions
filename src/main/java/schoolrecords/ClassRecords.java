package schoolrecords;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String fourth_grade_a, Random random) {
    }

    public boolean addStudent(Student stu) {
        return true;
    }

    public double calculateClassAverage() {
        return 0;
    }

    public double calculateClassAverageBySubject(Subject sub) {
        return 0;
    }

    public void ClassRecords(String s, Random rnd) {

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

    public boolean removeStudent(Student stu) {
        return true;
    }

    public Student repetition() {
        return new Student("a");
    }

    public List<StudyResultByName> listStudyResults() {
    return null;
    }
}
