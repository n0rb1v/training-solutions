package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassNotebook {
    private List<Student> students;

    public ClassNotebook(List<Student> students) {
        this.students = students;
    }

    public List<Student> sortNotebook() {
        List<Student> result = new ArrayList<>(students);
        result.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return result;
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        ClassNotebook cnb = new ClassNotebook(new ArrayList<>(List.of(
                new Student("Jozsi"),
                new Student("Bill"),
                new Student("Gizi"))));

        System.out.println(cnb.getStudents());
        System.out.println(cnb.sortNotebook());
    }
}
