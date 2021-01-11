package week11d01;

import org.junit.jupiter.api.Test;
import week10d05.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {
    @Test
    void test1() {

        assertEquals(1,new DivisorFinder().findDivisors(425));
        assertEquals(0,new DivisorFinder().findDivisors(29));
        assertEquals(2,new DivisorFinder().findDivisors(15));

    }


}