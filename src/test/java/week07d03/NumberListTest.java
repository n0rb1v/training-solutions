package week07d03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberListTest {
    @Test
    public void test1() {
        assertEquals(true, NumberList.isIncreasing(Arrays.asList(1, 2, 3, 3, 3, 5)));
        assertEquals(false, NumberList.isIncreasing(Arrays.asList(1, 2, 3, 2, 3, 5)));
        assertEquals(true, NumberList.isIncreasing(Arrays.asList(-1, 2, 3, 3, 3, 5)));

    }
}