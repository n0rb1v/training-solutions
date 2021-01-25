package stringbasic;

import org.junit.jupiter.api.Test;
import week03d04.Operation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    @Test
    void Test1() {
        Operation op = new Operation("25+35");

        assertEquals(60, op.getResult());

    }
    @Test
    void Test2() {
        Operation op = new Operation("  25  +   35 ");

        assertEquals(60, op.getResult());

    }

}
