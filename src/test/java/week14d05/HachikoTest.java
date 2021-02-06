package week14d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HachikoTest {

    @Test
    void countWords() {
        Hachiko hachiko = new Hachiko(Path.of("src/main/resources/hachiko.srt"));
        System.out.println(hachiko.countWords("Hachiko", "haza",
                "pályaudvar", "jó"));
    }
}