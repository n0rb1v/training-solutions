package week10d05;

import org.junit.jupiter.api.Test;
import week07d02.DigitSum;
import week10d02.MaxTravel;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void test1() {
        int[] intArray = new int[] {1, 3, 9, 7, 5};
        assertEquals(16,new Calculator().findMinSum(intArray));
    }
    @Test
    public void incorrectParameterShouldThrowException1() throws IllegalArgumentException {
        int[] intArray = new int[] {1, 7, 9};
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Calculator().findMinSum(intArray));
        assertEquals("Parameter error", ex.getMessage());
    }


}