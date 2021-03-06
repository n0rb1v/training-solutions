package week14d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    void index() {
        assertEquals("{A=[Abraham], L=[Lujza, Lajos], M=[Magdolna], O=[Odon]}",
                new Indexer().index(Arrays.asList("Odon", "Lujza", "Lajos", "Abraham", "Magdolna")).toString());
    }
}