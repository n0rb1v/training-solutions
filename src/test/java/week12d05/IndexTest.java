package week12d05;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class IndexTest {
    @Test
    void Test1() {
        InputStream is = Index.class.getResourceAsStream("/index.html");
        String sample = "koronavírus\nalma\nkoronavírus\nkörte\nmeggy";
        try {
            URL url = new URL("https://index.hu");
            assertEquals(9, new Index().countStr("koronavírus", new BufferedReader(new InputStreamReader(is))));
            assertEquals(0, new Index().countStr("koronavírus", Files.newBufferedReader(Path.of("unsecret.txt"))));
            assertEquals(2, new Index().countStr("koronavírus", new BufferedReader(new StringReader(sample))));
            assertEquals(9, new Index().countStr("koronavírus", new BufferedReader(new InputStreamReader(url.openStream()))));

        } catch (IOException e) {
            throw new IllegalStateException("hibas file", e);
        }

    }

}