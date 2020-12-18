package week08d05;

import org.junit.jupiter.api.Test;
import week08d02.Lottery;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {
    @Test
    void test1() {
        assertEquals(2,MathAlgorithms.greatestCommonDivisor(6,8));

    }
}
