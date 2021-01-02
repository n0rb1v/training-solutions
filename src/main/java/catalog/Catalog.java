package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<CatalogItem> catalogItems = new ArrayList<>();

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

    public int getFullLength() {
        return 1;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
        return null;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        return null;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        return null;
    }
}
