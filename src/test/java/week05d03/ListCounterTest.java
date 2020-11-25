package week05d03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {
    @Test
    public void testList() {
        List<String> test = Arrays.asList("abc","bela","aladar","geza","ALADDIN","Jani","arra");
        ListCounter test2 = new ListCounter();

        assertEquals(4, test2.countZero(test) );
    }
    @Test
    public void testListZero() {
        List<String> test = Arrays.asList();
        ListCounter test2 = new ListCounter();

        assertEquals(0, test2.countZero(test) );
    }
    @Test
    public void testNoHit() {
        List<String> test = Arrays.asList("Dbc","bela","ladar","geza","PALADDIN","Jani");
        ListCounter test2 = new ListCounter();

        assertEquals(0, test2.countZero(test) );
    }

}
