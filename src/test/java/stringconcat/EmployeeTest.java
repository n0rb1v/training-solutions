package stringconcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    @Test
    void test1() {
        Employee em = new Employee("geza","komuves",100000);

        assertEquals("geza - komuves - 100000",em.toString());
    }

    @Test
    void testName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("", "komuves", 100000));

        assertEquals("Nev ures", ex.getMessage());
    }
    @Test
    void testJob() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("geza", "", 100000));

        assertEquals("Munka ures", ex.getMessage());
    }
    @Test
    void testCost1() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("geza", "komuves", -100000));

        assertEquals("Fizu nem jo", ex.getMessage());
    }
    @Test
    void testCost2() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("geza", "komuves", 115624));

        assertEquals("Fizu nem jo", ex.getMessage());
    }
}
