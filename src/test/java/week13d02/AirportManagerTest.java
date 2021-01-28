package week13d02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class AirportManagerTest {

    @Test
    void loadList() {
        AirportManager am = new AirportManager();
        am.loadList(Path.of("src/main/resources/cities.txt"));
        assertEquals(100, am.getaList().size());

        assertEquals("Departure", am.countAp() );

        assertEquals("jarat=PP7873 irany=Arrival varos=Rome idopont=06:16",am.AirportFind("PP7873").toString());

        System.out.println(am.findByCity("Paris", "Arrival"));

        assertEquals("jarat=FG3210 irany=Departure varos=Zurich idopont=06:16", am.findEarlier().toString() );

    }
}