package covid;

import java.util.ArrayList;
import java.util.List;

public class Covid {
    private List<Citizen> citizens = new ArrayList<>();

    public void addCitizen(Citizen c){
        citizens.add(c);
    }

    public List<Citizen> getCitizens() {
        return new ArrayList<>(citizens);
    }
}
