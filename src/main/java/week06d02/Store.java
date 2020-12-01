package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> productList = new ArrayList<>();

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public int getProductByCategoryName(Category category) {
        int sum = 0;
        for (Product item: productList){
            if (category==item.getCategory()){
                sum++;
            }
        }
        return sum;
    }
}
