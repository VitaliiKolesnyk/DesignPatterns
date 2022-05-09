package patterns.behavioral.iterator.iterator;

import patterns.behavioral.iterator.catalog.CatalogItem;

public interface MyIterator {
    CatalogItem next();
    boolean hasNext();
}
