package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Joco");
        client.setAddress("bogyo utca");
        client.setYear(1987);
        System.out.println(client.getName()+"/"+client.getAddress()+"/"+client.getYear());
        client.migrate("elso utca");
        System.out.println(client.getName()+"/"+client.getAddress()+"/"+client.getYear());

    }
}
