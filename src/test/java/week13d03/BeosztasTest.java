package week13d03;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class BeosztasTest {

    @Test
    void szumOraszam() {
        Beosztas beosztas = new Beosztas();
        beosztas.loadList(Path.of("src/main/resources/beosztas.txt"));
        assertEquals(24, beosztas.szumOraszam("Albatrosz Aladin"));

    }
}