package week06d04;

import org.junit.jupiter.api.Test;
import week05d05.User;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BudgetTest {

    List<Item> test = Arrays.asList(new Item(100,3,"cekla"),
            new Item(400,3,"repa"),
            new Item(500,2,"sajt"),
            new Item(860,1,"turo"),
            new Item(220,3,"kenyer"),
            new Item(876,6,"kifli")
    );
    Budget budget = new Budget(test);


    @Test
    public void incorrectParameterShouldThrowException1() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Budget(test).getItemsByMonth(15));
        assertEquals("rossz parameter", ex.getMessage());
    }
    @Test
    public void testList() {
        //assertEquals(, budget.getItemsByMonth(3));
    }

}
