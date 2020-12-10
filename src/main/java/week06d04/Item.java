package week06d04;

import java.time.LocalDate;

public class Item {
    private int price;
    private String name;
    private LocalDate date;

    public Item(int price, int year, int month, int day, String name) {
        if (price < 0) {
            throw new IllegalArgumentException("wrong price");
        }
        this.price = price;
        this.name = name;
        date = LocalDate.of(year, month, day);
    }

    public Item(int price, LocalDate date, String name) {
        this.price = price;
        this.name = name;
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
