package week08d05;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int number) {
        return 1;
    }

    public void deleteItemByRegistrationNumber(String s) {

    }

    public int getAllPageNumber() {
        return 1;
    }

    public int fullLength() {
        return 1;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        return null;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        return null;
    }
}
