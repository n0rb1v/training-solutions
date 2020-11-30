package week05d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    @Test
    public void testList() {
        Store store = new Store();
        store.addProducts(new Product("tej",2020,11,29));
        store.addProducts(new Product("kenyer",2020,12,5));
        store.addProducts(new Product("vaj",2020,11,30));
        store.addProducts(new Product("kifli",2020,11,27));

        assertEquals(2, store.getNumberOfExpired());
    }

}
