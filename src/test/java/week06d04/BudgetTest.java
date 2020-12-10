package week06d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BudgetTest {

    List<Item> test = Arrays.asList(new Item(100,2020,11,5,"cekla"),
            new Item(400,2020,10,8,"repa"),
            new Item(500,2020,9,11,"sajt"),
            new Item(860,2020,5,21,"turo"),
            new Item(220,2020,7,9,"kenyer"),
            new Item(876,2020,7,19,"kifli")
    );
    Budget budget = new Budget(test);


    @Test
    public void incorrectParameterShouldThrowException1() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Budget(test).getItemsByMonth(15));
        assertEquals("rossz parameter", ex.getMessage());
    }
    @Test
    public void testList() {
        List<Item> result = budget.getItemsByMonth(7);
        assertEquals(2,result.size());
        assertEquals("kenyer",result.get(0).getName());
        assertEquals("kifli",result.get(1).getName());
    }

}
