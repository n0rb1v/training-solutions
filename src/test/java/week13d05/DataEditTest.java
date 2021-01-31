package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataEditTest {

    @Test
    void sumOfLetters() {
        DataEdit de = new DataEdit();

        assertEquals(4,de.SumOfLetters("n0rb1v"));


    }
}