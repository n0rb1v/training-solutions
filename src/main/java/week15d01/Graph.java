package week15d01;

import java.util.Map;

public class Graph {

    public Map.Entry<Double, Double> maxValue(Map<Double, Double> graphMap) {
        if (graphMap.isEmpty()) {
            throw new IllegalArgumentException("param error");
        }
        Map.Entry<Double, Double> maxEntry = null;
        double maxValue = Double.NEGATIVE_INFINITY;

        for (Map.Entry<Double, Double> item : graphMap.entrySet()) {
            if (maxValue < item.getValue()) {
                maxValue = item.getValue();
                maxEntry = item;
            }
        }
        return maxEntry;
    }
}
