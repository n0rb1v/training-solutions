package methodparam;

import java.util.Arrays;

public class Measurement {
    private double[] vals;

    public Measurement(double[] vals) {
        this.vals = vals;
    }

    public int findFirstIndexInLimit(int min, int max) {
        for (int k = 0; k < vals.length; k++) {
            if (vals[k] > min && vals[k] < max) {
                return k;
            }
        }
        return -1;
    }

    public double minimum() {
        return Arrays.stream(vals).min().getAsDouble();
    }

    public double maximum() {
        return Arrays.stream(vals).max().getAsDouble();
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(),maximum());
    }
}
