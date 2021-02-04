package week14d04;

import java.util.ArrayList;
import java.util.List;

public class Contract {
    private String client;
    private List<Integer> monthlyPrices;

    public Contract(String client, List<Integer> monthlyPrices) {
        this.client = client;
        this.monthlyPrices = monthlyPrices;
    }

    public Contract(Contract c) {
        this.client = c.client;
        this.monthlyPrices = new ArrayList<>(c.getMonthlyPrices());
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public List<Integer> getMonthlyPrices() {
        return monthlyPrices;
    }

    public void setMonthlyPrices(int i,int price) {
        monthlyPrices.set(i,price);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "client='" + client + '\'' +
                ", monthlyPrices=" + monthlyPrices +
                '}';
    }
}
