package algorithmsmax;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        int max = 0;
        Salesperson person = null;
        for (Salesperson item : sales) {
            if (item.getDifferenceFromTarget() > max) {
                max = item.getDifferenceFromTarget();
                person=item;
            }
        }
        return person;
    }
}
