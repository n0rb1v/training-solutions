package week03d02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean theyEqual(Product p) {
        return this.name.equals(p.getName());
    }

    public static void main(String[] args) {
        Product product1 = new Product("konyv","0001");
        Product product2 = new Product("konyv","0002");
        Product product3 = new Product("ujsag","0003");

        System.out.println(product1.theyEqual(product2));
        System.out.println(product1.theyEqual(product3));

    }
}
