package methodvarargs;

import org.junit.jupiter.api.Test;
import week05d05.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExamStatsTest {
    @Test
    public void test1() {
        ExamStats exa = new ExamStats(100);

        assertEquals(3, exa.getNumberOfTopGrades(90,85,77,91,88,94,96));
    }
    @Test
    public void test2() {
        ExamStats exa = new ExamStats(100);

        assertEquals(true, exa.hasAnyFailed(51,85,48,91,88,94,96));
    }
    @Test
    public void incorrectParameterShouldThrowException1() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ExamStats(100).getNumberOfTopGrades(90));
        assertEquals("Rossz parameter", ex.getMessage());
    }

}
