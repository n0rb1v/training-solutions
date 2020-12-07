package week07d01;

import org.junit.jupiter.api.Test;
import week06d04.Budget;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathAlgorithmsTest {
    @Test
    public void test1() {
        assertEquals(false, MathAlgorithms.isPrime(20));

    }
    @Test
    public void test2() {
        assertEquals(true, MathAlgorithms.isPrime(13));

    }
    @Test
    public void incorrectParameterShouldThrowException1() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(-1));
        assertEquals("rossz parameter", ex.getMessage());
    }

}
