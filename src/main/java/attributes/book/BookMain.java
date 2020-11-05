package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("abc");
        System.out.println(book1.getTitle());
        book1.setTitle("cba");
        System.out.println(book1.getTitle());

    }
}
