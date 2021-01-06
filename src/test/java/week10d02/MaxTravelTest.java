package week10d02;

import org.junit.jupiter.api.Test;
import week10d01.Hiking;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {
    @Test
    void test1() {
        assertEquals(13.0, new MaxTravel().getMaxIndex(List.of(0,2,2,5,7,7,13,5,13,13,9)));

    }

}