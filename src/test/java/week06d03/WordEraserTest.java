package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {
    @Test
    public void test1() {
        WordEraser testWord = new WordEraser();

        assertEquals("körte barack szilva körte birsalma",testWord.eraseWord("alma körte barack alma szilva körte birsalma","alma"));

    }

}
