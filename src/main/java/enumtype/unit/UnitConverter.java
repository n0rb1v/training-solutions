package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {
    public List<LengthUnit> siUnits() {
        List<LengthUnit> result = new ArrayList<>();
        for (LengthUnit item: LengthUnit.values()) {
            if (item.getSi()) {
                result.add(item);
            }
        }
        return result;
    }

    public BigDecimal convert(BigDecimal lenght, LengthUnit source, LengthUnit target) {
        return lenght.multiply(new BigDecimal(source.getInmm()))
                .divide(new BigDecimal(target.getInmm()),4, RoundingMode.HALF_UP);
    }
}
