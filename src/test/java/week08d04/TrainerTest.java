package week08d04;

import org.junit.jupiter.api.Test;
import week08d05.MathAlgorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {
    @Test
    void Test1() {
        Trainer tr1 = new Trainer(new GoodMood());
        Trainer tr2 = new Trainer(new BadMood());

        assertEquals(5, tr1.giveMark());
        assertEquals(3, tr2.giveMark());

    }
}
