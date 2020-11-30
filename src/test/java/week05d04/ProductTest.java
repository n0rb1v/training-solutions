package week05d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void testList() {
        Product product = new Product("tej",2020,11,30);

        assertEquals(LocalDate.of(2020,11,30), product.getLejarat());
    }

}
