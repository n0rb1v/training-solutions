package week12d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class IndexTest {
    @Test
    void Test1() {
        InputStream is = Index.class.getResourceAsStream("/index.html");
        try {
            assertEquals(9, new Index().countStr("koronavírus", new BufferedReader(new InputStreamReader(is))));
            assertEquals(0, new Index().countStr("koronavírus", Files.newBufferedReader(Path.of("unsecret.txt"))));
        } catch (IOException e) {
            throw new IllegalStateException("hibas file", e);
        }

    }

}