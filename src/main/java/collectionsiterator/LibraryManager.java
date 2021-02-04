package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {
    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {
        for (Iterator<Book> b = libraryBooks.iterator(); b.hasNext(); ) {
            Book result = b.next();
            if (result.getRegNumber() == regNumber) {
                return result;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        Iterator<Book> b = libraryBooks.iterator();
        while (b.hasNext()) {
            if (b.next().getRegNumber() == regNumber){
                b.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> result =  new HashSet<>();
        for (Iterator<Book> b = libraryBooks.iterator(); b.hasNext(); ) {
            Book tmp = b.next();
            if (tmp.getAuthor().equals(author)) {
                result.add(tmp);
            }
        }
        if (result.isEmpty()) {
            throw new MissingBookException("No books found by " + author);
        }
        return result;
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }

    public Set<Book> getLibraryBooks() {
        return libraryBooks;
    }
}
