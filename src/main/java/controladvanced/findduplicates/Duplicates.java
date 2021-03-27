package controladvanced.findduplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> find(List<Integer> li) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            if (findpre(li.get(i), i, li)) {
                result.add(li.get(i));
            }
        }
        return result;
    }

    private boolean findpre(int number, int index, List<Integer> li) {
        for (int i = 0; i < index; i++) {
            if (li.get(i) == number) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> find2(List<Integer> elements) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (elements.get(i).equals(elements.get(j))) {
                    result.add(elements.get(i));
                    break;
                }
            }
        }
        return result;
    }
}
