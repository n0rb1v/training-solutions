package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger) {
        if (getPassengers().size() < boat.getMaxPassengers()) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("param error");
        }
    }

    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice * passenger.getCruiseClass().getValue();

    }

    public Passenger findPassengerByName(String s) {
        Passenger result = null;
        for (Passenger item : passengers) {
            if (item.getName().equals(s)) {
                result = item;
            }
        }
        return result;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> result = new ArrayList<>();
        for (Passenger item: passengers){
            result.add(item.getName());
        }
        Collections.sort(result);
        return result;
    }

    public double sumAllBookingsCharged() {
        double result = 0;
        for (Passenger item: passengers){
            result += item.getCruiseClass().getValue()*basicPrice;
        }
        return result;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> result = new HashMap<>();

        for (Passenger item: passengers){

            if (!result.containsKey(item.getCruiseClass())) {
                result.put(item.getCruiseClass(), 0);
            }
            result.put(item.getCruiseClass(), result.get(item.getCruiseClass()) + 1);
        }

        return result;
    }
}
