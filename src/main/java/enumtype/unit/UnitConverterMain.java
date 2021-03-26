package enumtype.unit;

import java.math.BigDecimal;
import java.util.Arrays;

public class UnitConverterMain {
    public static void main(String[] args) {
        UnitConverter uc = new UnitConverter();
        System.out.println(uc.convert(new BigDecimal(1000),LengthUnit.CM,LengthUnit.CM));
        System.out.println(uc.convert(new BigDecimal(10),LengthUnit.CM,LengthUnit.MM));
        System.out.println(uc.convert(new BigDecimal(100),LengthUnit.CM,LengthUnit.M));
        System.out.println(uc.convert(new BigDecimal(1),LengthUnit.FOOT,LengthUnit.M));
        System.out.println(uc.convert(new BigDecimal(17),LengthUnit.INCH,LengthUnit.CM));

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(uc.siUnits());

    }
}
