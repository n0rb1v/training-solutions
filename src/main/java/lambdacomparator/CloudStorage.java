package lambdacomparator;

import java.util.List;

public class CloudStorage implements Comparable<CloudStorage> {
    private String provider;
    private int space;
    private double price;
    private PayPeriod payPeriod;

    public CloudStorage(String provider, int space, PayPeriod payPeriod, double price) {
        this.provider = provider;
        this.space = space;
        this.price = price;
        this.payPeriod = payPeriod;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public double getPrice() {
        return price;
    }

    public PayPeriod getPeriod() {
        return payPeriod;
    }


    @Override
    public int compareTo(CloudStorage o) {
        double thisValue = this.payPeriod != null ? this.price * 12 / this.payPeriod.getLenght() / this.space * 1000 : 0;
        double otherValue = o.payPeriod != null ? o.price * 12 / o.payPeriod.getLenght() / o.space * 1000 : 0;
        return Double.compare(thisValue,otherValue);
    }
}
