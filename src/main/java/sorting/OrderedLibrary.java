package sorting;

import java.util.Set;

public class OrderedLibrary {
    Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = library;
    }

    public Book lendFirstBook() {
        if (library.iterator().hasNext()) {
            return library.iterator().next();
        }
        throw new NullPointerException("Libray is empty!");
    }
}
