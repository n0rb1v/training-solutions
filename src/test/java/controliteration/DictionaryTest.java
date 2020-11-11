package controliteration;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryTest {
    @Test
    void keres() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem("kutya", Arrays.asList("pooch","dog"));
        List<String> translations = dictionary.findTranslations("kutya");
        assertEquals(Arrays.asList("pooch","dog"),translations);
    }
}
