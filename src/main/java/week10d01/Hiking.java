package week10d01;

import java.util.List;

public class Hiking {

    public static double getPlusElevation(List<Double> adatok) {
        double sum = 0;
        for (int i = 1; i < adatok.size(); i++) {
            if (adatok.get(i) > adatok.get(i - 1)){
                sum+= adatok.get(i)- adatok.get(i-1);
            }
        }
        return sum;
    }
}
