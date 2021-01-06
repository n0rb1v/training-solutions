package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testOver14() {
        Person p = new Person("John", 16);
        p.setPresent();

        assertNotEquals(null, p.getPresent());
        assertNotEquals(Present.TOY, p.getPresent());
    }

    @Test
    void testUnder14() {
        Person p = new Person("Jane",13);
        p.setPresent();

        assertNotEquals(null, p.getPresent());

    }
}