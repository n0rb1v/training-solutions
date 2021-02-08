package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void maxValue() {
    Graph graph = new Graph();

        Map<Double, Double> function = new HashMap<>();
        function.put(-2.0,-1.0);
        function.put(-1.0,-7.0);
        function.put(0.0,-8.0);
        function.put(2.0,-2.0);
        function.put(1.0,-0.5);

        Map.Entry<Double, Double> result = graph.maxValue(function);
        System.out.println(result);

    }
}