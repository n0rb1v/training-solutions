package typeconversion.wichtype;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

public class WhichType {
    public List<Type> wichType(String s) {
        List<Type> result = new ArrayList<>();
        for (Type item : Type.values()) {
            if (Long.parseLong(s) < item.getMax() && Long.parseLong(s) > item.getMin()) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        WhichType wt = new WhichType();
        System.out.println(wt.wichType("-20404546101"));
    }
}
