package week08d01;

import org.junit.jupiter.api.Test;
import week08d03.StringLists;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {
    @Test
    void test1() {
        Robot robot = new Robot();

        assertEquals("0:-3", robot.move("LLL",new Point(0,0)));
        assertEquals("3:-3", robot.move("FFLLLLLBBBBJJJJJJJ",new Point(0,0)));

    }
}
