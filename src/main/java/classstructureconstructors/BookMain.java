package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {

        Book book=new Book("Jozsi","Kutya");
        System.out.println(book.getAuthor()+book.getTitle()+book.getRegNumber());
        book.register("A0001");
        System.out.println(book.getAuthor()+book.getTitle()+book.getRegNumber());

    }
}
