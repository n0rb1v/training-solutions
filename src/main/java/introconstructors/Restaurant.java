package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<String> menu = new ArrayList<>();
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = 4*numberOfTables;
        this.addItem("Bablesves");
        this.addItem("Sulthus");
        this.addItem("Krumpli");
        this.addItem("Husleves");

    }
    public void addItem(String item){
        menu.add(item);
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getMenu() {
        return menu;
    }
}
