package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("neve?");
        String x=scanner.nextLine();
        System.out.println("ara?");
        int i= scanner.nextInt();
        Product product=new Product(x,i);
        System.out.println(product.getName()+product.getPrice());
        product.incPrice(33);
        System.out.println(product.getName()+product.getPrice());
        product.decPrice(200);
        System.out.println(product.getName()+product.getPrice());


    }
}
