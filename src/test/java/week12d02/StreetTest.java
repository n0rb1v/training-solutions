package week12d02;

import org.junit.jupiter.api.Test;
import week12d01.GradeRounder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreetTest {

    @Test
    void getSiteNumber() {
        Street street = new Street();
        street.sellSite(new Site(0,10,Fence.PERFECT));
        street.sellSite(new Site(0,7,Fence.NEED_UPGRADE));
        street.sellSite(new Site(1,12,Fence.NEED_UPGRADE));
        street.sellSite(new Site(0,9,Fence.PERFECT));
        street.sellSite(new Site(0,11,Fence.NO_FENCE));
        street.sellSite(new Site(1,13,Fence.PERFECT));

        assertEquals(6, street.getSites().size());
        assertEquals(3, street.getLastSite());

        assertEquals(3, street.statOf().size());
        assertEquals(3, street.statOf().get(0).getNumber());
        assertEquals(2, street.statOf().get(1).getNumber());
        assertEquals(1, street.statOf().get(2).getNumber());

    }
}