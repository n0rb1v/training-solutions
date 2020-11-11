package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DayOfWeeksTest {
    @Test
    void testDays1() {
        assertEquals("hét eleje", new DayOfWeeks().whichDay("hétfo"));
        assertEquals("hét közepe",new DayOfWeeks().whichDay("szerda"));
        assertEquals("majdnem hétvége",new DayOfWeeks().whichDay("péntek"));
        assertEquals("hét vége",new DayOfWeeks().whichDay("szombat"));

    }

    @Test
    void testCase() {
        assertEquals("hét vége", new DayOfWeeks().whichDay("sZomBaT"));
    }

    @Test
    void illegalTest() {
        assertThrows(IllegalArgumentException.class, () -> new DayOfWeeks().whichDay("aaass"));
    }
}
