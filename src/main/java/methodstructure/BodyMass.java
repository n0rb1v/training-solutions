package methodstructure;

public class BodyMass {
    private double tomeg;
    private double magassag;

    public BodyMass(double tomeg, double magassag) {
        this.tomeg = tomeg;
        this.magassag = magassag;
    }

    public double getWeight() {
        return tomeg;
    }

    public double getHeight() {
        return magassag;
    }

    public double bodyMassIndex() {
        return tomeg / Math.pow(magassag,2);
    }

    public BmiCategory body() {
        BmiCategory bmi = BmiCategory.NORMAL;
        if (bodyMassIndex() < 18.5) {
            bmi = BmiCategory.UNDERWEIGHT;
        }
        if (bodyMassIndex() > 25) {
            bmi = BmiCategory.OVERWEIGHT;
        }
        return bmi;
    }

    public boolean isThinnerThan(BodyMass bm) {
        if (this.bodyMassIndex() < bm.bodyMassIndex()) {
            return true;
        }
        return false;
    }
}
