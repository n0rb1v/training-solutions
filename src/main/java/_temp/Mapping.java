package _temp;

import week14d02.Order;

import java.util.*;

public class Mapping {
    private Map<String, Object> map1 = new HashMap<>();

    public void addMapObject(String key, Object o) {
        //Object o = new Object();
        if (!map1.containsKey(key)) {
            map1.put(key, o);
        }
        map1.get(key).getClass();       //Object.method;
    }

    private Map<String, List<String>> map2 = new HashMap<>();

    public void addMapList(String key, String item) {
        if (!map2.containsKey(key)) {
            map2.put(key, new ArrayList<>());
        }
        map2.get(key).add(item);

    }
    private List<Order> orders = List.of(new Order("A1"), new Order("B2")); //A1 {bread,tomato,flour,sugar},B2 {apple,tomato,corn,sugar}

    public Map<String, Integer> mapStat() {
    Map<String, Integer> result = new HashMap<>();
        for (Order item : orders) {
            for (String product : item.getProducts()) {
                if (!result.containsKey(product)) {
                    result.put(product, 0);
                }
                result.put(product, result.get(product) + 1);
            }
        }
        return result;

    }



}

