package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
        Item item1=new Item("konyv",5,2480);
        Item item2=new Item("csoki",4,480);
        Item item3=new Item("ujsag",6,280);
        Item item4=new Item("kepeslap",8,380);

        Bill bill1= new Bill();
        bill1.addItem(item1);
        bill1.addItem(item3);
        bill1.addItem(item4);

        System.out.println(bill1.calculateTotalPrice());
    }
}
