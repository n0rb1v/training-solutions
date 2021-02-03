package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class OnlineShop {
    private List<Order> orders = new ArrayList<>();

    public void readFile(Path path) {
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] order = line.split(" ");
                String[] products = order[1].split(",");
                Order o = new Order(order[0]);
                o.addProduct(products);
                orders.add(o);
            }
        } catch (IOException e) {
            throw new IllegalStateException("file error", e);
        }
    }

    public int countProduct(String s) {
        return statistic().get(s);
    }

    public Order selectOrder(String s) {
        Order result = null;
        for (Order item : orders) {
            if (item.getId().equals(s)) {
                result = item;
            }
        }
        return result;
    }

    public Map<String, Integer> statistic() {
        Map<String, Integer> result = new HashMap<>();
        for (Order item : orders) {
            for (String str : item.getProducts()) {
                if (!result.containsKey(str)) {
                    result.put(str, 0);
                }
                result.put(str,result.get(str)+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        OnlineShop os = new OnlineShop();
        os.readFile(Path.of("src/main/resources/orderlist.txt"));
        System.out.println(os.selectOrder("B341").sortProducts().getProducts());
        System.out.println(os.countProduct("sugar"));
        System.out.println(os.selectOrder("W34111").getProductNumber());
        System.out.println(os.statistic());
    }
}
