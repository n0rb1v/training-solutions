package week13d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LenghtMaxTest {
    @Test
    void test1() {
        LenghtMax lm = new LenghtMax();
        lm.createList("iranyitoszamok-varosok-2021.csv");

        assertEquals(3324, lm.getCitys().size());

        assertEquals("Jászfelsőszentgyörgy", lm.findCityMax());

    }
}