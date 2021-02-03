package week14d02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Order {
    private String id;
    private List<String> products = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void addProduct(String[] s) {
        for (String item : s) {
            products.add(item);
        }
    }

    public String getId() {
        return id;
    }

    public Order sortProducts() {
        products.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return this;
    }

    public int getProductNumber() {
        return products.size();
    }

    public List<String> getProducts() {
        return products;
    }
}
