package methodchain;

public class Robot {
    private int distance;
    private int azimut;


    public Robot go(int meter) {
        this.distance += meter;
        return this;
    }

    public Robot rotate(int angle) {
        this.azimut += angle;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    @Override
    public String toString() {
        return distance+","+azimut;
    }
}
