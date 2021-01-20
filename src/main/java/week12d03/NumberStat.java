package week12d03;

import java.util.List;

public class NumberStat {
    public int xCount(List<Integer> nList) {
        if (nList.size() < 1) {
            throw new IllegalArgumentException("hibas lista");
        }
        int[] xStat = new int[10];
        for (int item : nList) {
            xStat[item]++;
        }
        for (int i = 0; i < xStat.length; i++) {
            if (xStat[i] == 1){
                return i;
            }
        }
        throw new IllegalStateException("nincs ilyen");
    }
}
