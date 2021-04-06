package methodpass;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();


    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void moveTrooperByName(String s, Position p) {
        for (Trooper item : troopers) {
            if (item.getName().equals(s)) {
                item.changePosition(p);
            }
        }
    }

    public void moveClosestTrooper(Position p) {
        double min = 100;
        Trooper mintr = null;
        for (Trooper item : troopers) {
            if (item.distanceFrom(p) < min) {
                mintr = item;
                min = item.distanceFrom(p);
            }
        }
        mintr.changePosition(p);
    }
}
