package patterns.behavioral.iterator.catalog;

import patterns.behavioral.iterator.iterator.CatalogIterator;
import patterns.behavioral.iterator.iterator.MyIterator;

public class Catalog {
    static final int MAX_ITEMS = 10;
    int numberOfItems = 0;
    CatalogItem[] catalogItems;

    public CatalogItem[] getCatalogItems() {
        return catalogItems;
    }

    public void setCatalogItems(CatalogItem[] catalogItems) {
        this.catalogItems = catalogItems;
    }

    public MyIterator createIterator() {
        return new CatalogIterator(catalogItems);
    }
}
