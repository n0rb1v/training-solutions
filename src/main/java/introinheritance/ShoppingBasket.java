package introinheritance;

public class ShoppingBasket {
    private Basket basket = new Basket();

    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double sum = 0;
        for (Item item : basket.getItems()) {
            sum += item.getNettoPrice();
        }
        return sum;
    }

    public double sumTaxValue() {
        double sum = 0;
        for (Item item : basket.getItems()) {
            sum += item.getTaxAmount();
        }
        return sum;
    }

    public double sumBruttoPrice() {
        return sumNettoPrice() + sumTaxValue();
    }

    public void checkout() {
        basket.clearBasket();
    }

    public void removeMostExpensiveItem() {
        Item mostExp = basket.getItems().get(0);
        for (int i = 0; i < basket.getItems().size(); i++) {
            if (basket.getItems().get(i).nettoPrice > mostExp.nettoPrice) {
                mostExp = basket.getItems().get(i);
            }
        }
        basket.removeItem(mostExp.getBarcode());
    }
}
