package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {
    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> result = new ArrayList<>();
        for (int i = 0; i < numberOfDays; i++) {
            result.add(firstDay.getDayType());
            firstDay = firstDay.nextDay(firstDay);
        }
        return result;
    }

    public static void main(String[] args) {
        WorkdayCalculator wc = new WorkdayCalculator();
        System.out.println(wc.dayTypes(Day.MONDAY,11));
    }

}
