package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    @Test
    void test1() {
        Vehicle v1 = new Car(5);
        Vehicle v2 = new Truck(8,TransmissionType.MANUAL);
        Vehicle v3 = new Motorcycle(6);

        assertEquals(5,v1.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC,v1.getTransmissionType());
        assertEquals(8,v2.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL,v2.getTransmissionType());
        assertEquals(6,v3.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL,v3.getTransmissionType());

    }
}
