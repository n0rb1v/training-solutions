package week08d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LotteryTest {
    @Test
    void test1() {

        assertEquals(List.of(73,89,54,72,19),Lottery.getNumbers(89,5));

    }
}
