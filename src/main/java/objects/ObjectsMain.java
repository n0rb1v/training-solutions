package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1);

        Book emptybook;
        //System.out.println(emptybook);
        emptybook=null;
        System.out.println(emptybook);

        if (emptybook==null){
            System.out.println("igen null");
        }
        Book book2 = book1;
        System.out.println(book2);

        Book[] btomb = {new Book(), new Book(), new Book()};
        for (Book item: btomb){
            System.out.println(item);
        }

        List<Book> blist = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> books2 = new ArrayList<>();
        for (int i=0;i<3;i++){
            books2.add(new Book());
        }
        for (Book item: blist){
            System.out.println(item);
        }
        for (Book item: books2){
            System.out.println(item);
        }

    }
}
