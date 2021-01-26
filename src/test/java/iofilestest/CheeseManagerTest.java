package iofilestest;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheeseManagerTest {
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();


    @Test
    public void Test1() throws IOException {
        Path file = tempFolder.newFile("cheese.txt").toPath();
        System.out.println(file);
        List<Cheese> cheeseList = List.of(
                new Cheese("trapista", 555),
                new Cheese("medve", 335),
                new Cheese("edami", 599),
                new Cheese("camambert", 1555),
                new Cheese("marvany", 1250)
        );
        new CheeseManager().saveToFile(file,cheeseList);


    }
}