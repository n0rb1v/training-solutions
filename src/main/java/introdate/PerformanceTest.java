package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance("Queen", LocalDate.of(1968,7,22),
                LocalTime.of(17,45),LocalTime.of(19,45));
        System.out.println(performance.getInfo());
    }
}
