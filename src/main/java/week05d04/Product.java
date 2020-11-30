package week05d04;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate lejarat;

    public Product(String name,int year,int month,int day) {
        this.name = name;
        this.lejarat = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getLejarat() {
        return lejarat;
    }

    public boolean isExpired(){
        if (lejarat.isBefore(LocalDate.now())){
            return true;
        }
        return false;
    }
}
