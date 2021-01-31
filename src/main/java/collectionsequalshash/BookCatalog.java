package collectionsequalshash;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book search = new Book(title, author);
        return findBook(books, search);
    }

    public Book findBook(List<Book> books, Book book) {
        if (books.contains(book)) {
            int i = books.indexOf(book);
            return books.get(i);
        } else {
            return null;
        }

    }

    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> bookSet = new HashSet<>();
        for (Book item: books){
            bookSet.add(item);
        }
        return bookSet;
    }
}
