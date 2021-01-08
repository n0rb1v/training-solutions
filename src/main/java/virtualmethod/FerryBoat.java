package virtualmethod;

public class FerryBoat extends Vehicle {

    protected final static int MAX_CARRY_WEIGHT = 2000;
    Car car;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + car.getVehicleWeight();
    }

    public boolean canCarry(Car car) {
        return car.getVehicleWeight() < MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car) {
        if (canCarry(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{car=" + car + '}';
    }
}
