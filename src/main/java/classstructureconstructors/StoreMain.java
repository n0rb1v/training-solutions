package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {

        Store store1 = new Store("eger");
        Store store2 = new Store("attributes/bill");

        store1.store(18);
        store2.store(25);
        System.out.println(store1.getProduct()+store1.getStock());
        System.out.println(store2.getProduct()+store2.getStock());
        store1.dispatch(6);
        store2.dispatch(11);
        store2.store(5);
        System.out.println(store1.getProduct()+store1.getStock());
        System.out.println(store2.getProduct()+store2.getStock());


    }
}
