package week13d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMergerTest {

    @Test
    void merge() {
        TemplateMerger tm = new TemplateMerger();
        List<Employee> el = List.of(new Employee("Jozsi","1980"), new Employee("Geza", "1990"));
        String s = tm.merge(Path.of("src/main/resources/template.txt"),el);

        assertEquals("Az alkalmazott neve: Jozsi, születési éve: 1980\n" +
                        "Az alkalmazott neve: Geza, születési éve: 1990\n", s);

        System.out.println(s);

    }
}