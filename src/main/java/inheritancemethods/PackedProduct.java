package inheritancemethods;

import java.math.BigDecimal;

public class PackedProduct extends Product {
    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        int numberBox = pieces % packingUnit == 0 ? pieces / packingUnit : (pieces / packingUnit) + 1;
        BigDecimal box = weightOfBox.multiply(new BigDecimal(String.valueOf(numberBox)));
        return super.totalWeight(pieces).add(box);
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }
}
