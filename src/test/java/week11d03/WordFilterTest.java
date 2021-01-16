package week11d03;

import org.junit.jupiter.api.Test;
import week11d01.DivisorFinder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithChar() {
        List<String> str = List.of("abc","lotto","cica","kutya","barnac");

        assertEquals(3,new WordFilter().wordsWithChar(str,'c').size());
        assertEquals(List.of("abc","cica","barnac"),new WordFilter().wordsWithChar(str,'c'));


    }
}