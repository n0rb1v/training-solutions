package statements;

public class Investment {
    double cost = 0.3;
    int fund;
    int interestRate;
    boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return (double) fund * interestRate * days / (100.0 * 365);
    }

    public double close(int days) {
        double total = fund+getYield(days);
        double tcost = total*(cost/100);
        double pay = active ? total-tcost : 0;
        active = false;
        return pay;

    }

}
