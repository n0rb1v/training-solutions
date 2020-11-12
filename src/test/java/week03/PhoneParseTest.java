package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneParseTest {
    @Test
    void test1() {
        PhoneParse parser = new PhoneParse();
        String s = "70-6666666";

        Phone phone = parser.parse(s);

        //System.out.println(phone);
        assertEquals("Phone{prefix='70', number='6666666'}",phone.toString());
    }
}
