package algorithmsmax;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        int max = 0;
        Salesperson person = null;
        for (Salesperson item : sales) {
            if (item.getAmount() > max) {
                max = item.getAmount();
                person=item;
            }
        }
        return person;
    }
}
