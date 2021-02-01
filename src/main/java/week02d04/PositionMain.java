package week02d04;

import java.util.ArrayList;
import java.util.List;

public class PositionMain {

    public static void main(String[] args) {
        String[] nevek = {"aa","bb","cc","dd"};
        int[] bon = {90000,160000,110000,190000};

        List<Position> posList = new ArrayList<>();
        for (int i=0;i<nevek.length;i++){
            posList.add(new Position(nevek[i],bon[i]));

        }


        for (Position pos: posList){
            if (pos.getBonus() > 150_000){
                System.out.println(pos);
            }
        }
        int a = 10;
        double b = (15 - a) / 2 * (double) 3;
        System.out.println(b);

    }
}
