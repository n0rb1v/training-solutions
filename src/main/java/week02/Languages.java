package week02;

import attributes.bill.Item;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {
        List<String> nyelvek = new ArrayList<>();
        List<String> filter = new ArrayList<>();

        nyelvek.add("Java");
        nyelvek.add("Python");
        nyelvek.add("Javascript");

        for (String item: nyelvek){
            if (item.length()>5) {
                filter.add(item);
            }
        }
        System.out.println(filter);

    }
}
