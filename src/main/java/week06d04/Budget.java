package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    private List<Item> itemList = new ArrayList<>();

    public Budget(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Item> getItemsByMonth(int month){
        if (month<1||month>12){
            throw new IllegalArgumentException("rossz parameter");
        }
        List<Item> items2 = new ArrayList<>();
        for (Item mitem: itemList){
            if (mitem.getDate().getMonthValue()==month){
                items2.add(mitem);
            }
        }
        return items2;
    }
}
