package attributes.bill;

public class Item {
    private String product;
    private int quantitiy;
    private double price;

    public Item(String product, int quantitiy, double price) {
        this.product = product;
        this.quantitiy = quantitiy;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantitiy() {
        return quantitiy;
    }

    public double getPrice() {
        return price;
    }
}
