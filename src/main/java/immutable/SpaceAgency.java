package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {
    private List<Satellite> satList = new ArrayList<>();

    public void registerSatellite(Satellite satellite){
        if (satellite==null){
            throw new NullPointerException("Parameter must not be null!");
        }
        satList.add(satellite);

    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent){
        for (Satellite item: satList){
            if (item.getRegisterIdent().equals(registerIdent)){
                return item;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!XXX123");
    }

    @Override
    public String toString() {
        return satList.toString();
    }
}
