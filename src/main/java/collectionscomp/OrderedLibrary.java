package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {
    private List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle() {
        List<Book> result = new ArrayList<>(libraryBooks);
        Collections.sort(result);
        return result;
    }

    public List<Book> orderedByAuthor() {
        List<Book> result = new ArrayList<>(libraryBooks);
        Collections.sort(result, new AuthorComparator());
        return result;

    }

    public List<String> orderedByTitleLocale(Locale locale) {
        List<String> result = new ArrayList<>();
        for (Book item : libraryBooks) {
            result.add(item.getTitle());
        }
        Collections.sort(result, Collator.getInstance(locale));
        return result;
    }
}
