package week14d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

    @Test
    void Test1() {
        Student s = new Student("Jozsi");
        s.jegyBe("matek", 5);
        assertEquals(5, s.getJegyek().get("matek").get(0));
        assertEquals(1, s.getJegyek().size());
        s.jegyBe("matek", 3);
        assertEquals(2, s.getJegyek().get("matek").size());
        s.jegyBe("zene", 2);
        assertEquals(2, s.getJegyek().size());
        assertEquals(2, s.getJegyek().get("zene").get(0));
    }

    @Test
    void Test2() {
        ClassNotebook cnb = new ClassNotebook(new ArrayList<>(List.of(
                new Student("Jozsi"),
                new Student("Bill"),
                new Student("Gizi"))));

        assertNotEquals(cnb.getStudents(), cnb.sortNotebook());

    }
}