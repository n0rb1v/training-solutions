package covid;

import org.junit.jupiter.api.Test;
import week10d05.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CitizenTest {

    @Test
    void testEmptyName() {
        Citizen c = new Citizen("Jani","1185",50,"jani@uh.hu","123456788");
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Citizen("","1185",50,"jani@uh.hu","123456788"));
    }
    @Test
    void testEmptyIrsz() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Citizen("Jani","",50,"jani@uh.hu","123456788"));
    }
    @Test
    void testInvalidAge() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Citizen("Jani","1185",5,"jani@uh.hu","123456788"));
    }
    @Test
    void testInvalidEmail() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Citizen("Jani","1185",50,"jani","123456788"));
    }
    @Test
    void testInvalidTAJ() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Citizen("Jani","1185",50,"jani@uh.hu","123456789"));
    }

}