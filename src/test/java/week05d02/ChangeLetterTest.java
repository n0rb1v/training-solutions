package week05d02;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangeLetterTest {
    @Test
    public void testString() {
        //Given
        String s = "aladdin";
        ChangeLetter cl = new ChangeLetter();

        //Then

        assertEquals("*l*dd*n", cl.changeVowels(s) );
    }

}
