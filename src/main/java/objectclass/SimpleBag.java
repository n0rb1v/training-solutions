package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private List<Object> items = new ArrayList<>();
    private int cursor = 0;

    public SimpleBag() {

    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        if (items.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursor = 0;
    }

    public boolean hasNext() {
        if (cursor < items.size()-1) {
            return true;
        }
        return false;
    }

    public Object next() {
        cursor++;
        return items.get(cursor);
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }

    public int getCursor() {
        return cursor;
    }
}
