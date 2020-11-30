package week06d01;

import org.junit.jupiter.api.Test;
import stringscanner.StringScanner;
import week05d03.ListCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {
    @Test
    public void testList() {
        List<String> test = Arrays.asList("abc","bela","aladar","geza","ALADDIN","Jani","arra");
        ListSelector ls = new ListSelector();

        assertEquals("[abcaladarALADDINarra]", ls.filterList(test));
    }
    @Test
    public void nullList() {
        List<String> test = new ArrayList<>();
        ListSelector ls = new ListSelector();

        assertEquals("[]", ls.filterList(test));
    }
    @Test
    public void incorrectParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ListSelector().filterList(null));
        assertEquals("null lista", ex.getMessage());
    }


}
