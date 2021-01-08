package week10d05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    public int findMinSum(int[] arr) {
        if ((arr == null)||(arr.length<4)){
            throw new IllegalArgumentException("Parameter error");
        }
        List<Integer> arrNum = new ArrayList<>();
        for (int item : arr) {
            arrNum.add(item);
        }
        Collections.sort(arrNum);
        return arrNum.get(0)+arrNum.get(1)+ arrNum.get(2)+ arrNum.get(3);
    }
}
