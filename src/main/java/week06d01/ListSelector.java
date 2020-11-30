package week06d01;

import java.util.List;

public class ListSelector {

    public String filterList(List<String> stringList) {
        if (stringList == null) {
            throw new IllegalArgumentException("null lista");
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < stringList.size(); i++) {
            if (i % 2 == 0) {
                sb.append(stringList.get(i));
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
