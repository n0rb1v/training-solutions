package week07d02;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DigitSumTest {
    @Test
    public void test1() {
        assertEquals(6, DigitSum.sumOfDigits(123));
        assertEquals(14, DigitSum.sumOfDigits(3623));

    }
    @Test
    public void incorrectParameterShouldThrowException1() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> DigitSum.sumOfDigits(-1));
        assertEquals("negativ szam", ex.getMessage());
    }

}
