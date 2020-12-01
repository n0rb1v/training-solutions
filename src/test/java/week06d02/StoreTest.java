package week06d02;

import org.junit.jupiter.api.Test;
import week06d01.ListSelector;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    @Test
    public void testList() {

        List<Product> test = Arrays.asList(new Product("kanal",1500,Category.OTHER),
                new Product("kefir",150,Category.DAIRY),
                new Product("hal",1000,Category.FROZEN),
                new Product("villa",900,Category.OTHER),
                new Product("kes",2000,Category.OTHER)
                );

        Store store = new Store(test);

        assertEquals(3, store.getProductByCategoryName(Category.OTHER));
    }

}
