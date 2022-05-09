package patterns.behavioral.iterator;

import patterns.behavioral.iterator.catalog.Catalog;
import patterns.behavioral.iterator.catalog.CatalogItem;
import patterns.behavioral.iterator.iterator.MyIterator;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.setCatalogItems(new CatalogItem[] {
                new CatalogItem("Item1"),
                new CatalogItem("Item2"),
                new CatalogItem("Item3")});
                
        MyIterator iterator = catalog.createIterator();

        while (iterator.hasNext()) {
            CatalogItem catalogItem = iterator.next();
            System.out.println(catalogItem);
        }
    }
}
