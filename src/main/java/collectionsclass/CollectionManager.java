package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {
    private List<Book> library;

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(library);
    } //módosíthatatlan listát eredményez

    public List<Book> reverseLibrary() {
        List<Book> result = new ArrayList<>(library);
        Collections.reverse(result);
        return result;
    } //az eredeti lista másolatán dolgozik!

    public Book getFirstBook() {
        return Collections.min(library);
    } //a legrégebbi (legkisebb id) könyvet adja vissza

    public Book getLastBook() {
        return Collections.max(library);

    } // a legújabb (legnagyobb id) könyvet adja vissza
}
