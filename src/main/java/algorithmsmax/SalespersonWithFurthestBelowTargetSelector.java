package algorithmsmax;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales){
        int max = 0;
        Salesperson person = null;
        for (Salesperson item : sales) {
            if (item.getDifferenceFromTarget() < max) {
                max = item.getDifferenceFromTarget();
                person=item;
            }
        }

        return person;
    }
}
