package ioconvert;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class ProductWriter {

    public void saveProduct(OutputStream os, List<Product> products) {
        try (PrintStream ps = new PrintStream(os)){
            for (Product item: products){
                ps.print(item.getName()+";");
                ps.println(item.getPrice());
            }
        }
    }
}
