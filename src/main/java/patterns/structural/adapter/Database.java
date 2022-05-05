package patterns.structural.adapter;

public interface Database {
    void save();
    void load();
    void update();
    void remove();
}
