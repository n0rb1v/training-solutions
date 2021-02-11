package week15d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CovidTest {

    @Test
    void main() {
        Covid c = new Covid();
        c.loadFile();
        List<CovidData> temp = new ArrayList<>(c.getSorted());
        assertEquals("2020-48", temp.get(0).getWeek());
        assertEquals("2020-49", temp.get(1).getWeek());
        assertEquals("2020-46", temp.get(2).getWeek());


    }
}