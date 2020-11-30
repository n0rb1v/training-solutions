package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProducts(Product prod) {
        products.add(prod);
    }
    public int getNumberOfExpired(){
        int sum=0;
        for (Product item: products){
            if (item.isExpired()){
                sum++;
            }
        }
        return sum;
    }
}
