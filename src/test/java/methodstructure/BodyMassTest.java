package methodstructure;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BodyMassTest {
    @Test
    public void test1() {
        BodyMass test = new BodyMass(66,1.72);

        assertEquals(BmiCategory.NORMAL, test.body());
    }
    @Test
    public void test2() {
        BodyMass test = new BodyMass(96,1.72);

        assertEquals(BmiCategory.OVERWEIGHT, test.body());
    }
    @Test
    public void test3() {
        BodyMass test = new BodyMass(46,1.72);

        assertEquals(BmiCategory.UNDERWEIGHT, test.body());
    }

}
