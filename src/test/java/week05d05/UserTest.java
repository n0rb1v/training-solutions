package week05d05;

import org.junit.jupiter.api.Test;
import week06d01.ListSelector;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    @Test
    public void testUser() {
        User user1 = new User("Kis", "Bela", "kis@gmail.com");

        assertEquals("Kis Bela", user1.getFullName());
    }
    @Test
    public void incorrectParameterShouldThrowException1() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Kis", "Bela", "kisgmail.com"));
        assertEquals("hianyos email", ex.getMessage());
    }
    @Test
    public void incorrectParameterShouldThrowException2() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Kis", "Bela", "kis@gmailcom"));
        assertEquals("hianyos email", ex.getMessage());
    }

}
