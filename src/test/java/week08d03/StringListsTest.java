package week08d03;

import org.junit.jupiter.api.Test;
import week08d05.MathAlgorithms;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {
    @Test
    void test1() {
        List<String> a = Arrays.asList("aba","ava","ara","ata","ara");
        List<String> b = Arrays.asList("aba","aka","ara","aza");
        assertEquals(List.of("aba","ara"), StringLists.stringListsUnion(a,b));

    }
}
