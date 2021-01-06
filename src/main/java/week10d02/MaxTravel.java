package week10d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxTravel {
    public int getMaxIndex1(List<Integer> stops) {
        Collections.sort(stops);
        int sum = 0;
        int number = 0;
        for (int i = 1; i < stops.size(); i++) {
            if (stops.get(i) > stops.get(i - 1)) {
                number = i;
            } else {
                sum++;
            }
        }
        return number;
    }

    public int getMaxIndex2(List<Integer> stations) {
        int[] passengerSum = new int[30];
        int maxIndex = 0;
        int maxValue = 0;

        for (int item : stations) {
            passengerSum[item]++;
        }
        for (int i = 0; i < passengerSum.length; i++) {
            if (passengerSum[i] > maxValue) {
                maxValue = passengerSum[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
