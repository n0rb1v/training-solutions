package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance tav = new Distance(111.5,true);

        System.out.println("Tav:"+tav.distanceInKm+tav.exact);
        int i=(int)tav.distanceInKm;
        System.out.println(i);
    }
}
