package introconstructors;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant1= new Restaurant("Kifozde",4);

        System.out.println(restaurant1.getName()+restaurant1.getCapacity()+restaurant1.getMenu());
    }
}
