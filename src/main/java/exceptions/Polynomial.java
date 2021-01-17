package exceptions;

public class Polynomial {
    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficientStrs) {
        if (coefficientStrs == null) {
            throw new NullPointerException("coefficientStrs is null");
        }

        try {
            this.coefficients = convertCoefficientStrs(coefficientStrs);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", e);
        }
    }


    private double[] convertCoefficientStrs(String[] coefficientStrs) {
        double[] coefficients = new double[coefficientStrs.length];

        for (int i = 0; i < coefficientStrs.length; i++) {
            coefficients[i] = Double.parseDouble(coefficientStrs[i]);
        }
        return coefficients;
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public double evaluate(double x) {
        int n = coefficients.length - 1;
        double sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += coefficients[i] * Math.pow(x, (double) n - i);

        }
        return sum;
    }
}
