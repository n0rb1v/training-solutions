package week12d01;

import org.junit.jupiter.api.Test;
import week11d03.WordFilter;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {

    @Test
    void roundGrades() {
        int[] test = {51, 60, 73, 37, 83};
        int[] test2 = {51, 60, 75, 37, 85};

        assertEquals(test2[0], new GradeRounder().roundGrades(test)[0]);
        assertEquals(test2[1], new GradeRounder().roundGrades(test)[1]);
        assertEquals(test2[2], new GradeRounder().roundGrades(test)[2]);
        assertEquals(test2[3], new GradeRounder().roundGrades(test)[3]);
        assertEquals(test2[4], new GradeRounder().roundGrades(test)[4]);

    }
}