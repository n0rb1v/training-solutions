package stringbasic;

import org.junit.jupiter.api.Test;
import week03.Operation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    @Test
    void Test1() {
        Operation op = new Operation("25+35");

        assertEquals(60, op.getResult());




    }
}
