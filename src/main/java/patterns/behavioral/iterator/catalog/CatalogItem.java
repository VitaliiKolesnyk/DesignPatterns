package patterns.behavioral.iterator.catalog;

public class CatalogItem {
    private String name;

    public CatalogItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CatalogItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
