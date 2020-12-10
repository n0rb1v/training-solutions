package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabTest {
    @Test
    public void test1() {
        Lab lb1 = new Lab("matek");
        Lab lb2 = new Lab("fizika", LocalDate.of(2020,12,20));
        lb1.complete();

        assertEquals(true,lb2.isCompleted());
        assertEquals(LocalDate.of(2020,12,20),lb2.getCompletedAt());
        assertEquals(true,lb1.isCompleted());
        assertEquals(LocalDate.of(2020,12,10),lb1.getCompletedAt());

    }
}
