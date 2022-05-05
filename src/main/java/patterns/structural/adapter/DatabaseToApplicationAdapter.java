package patterns.structural.adapter;

public class DatabaseToApplicationAdapter implements Database {
    private JavaApplication javaApplication;

    public DatabaseToApplicationAdapter(JavaApplication javaApplication) {
        this.javaApplication = javaApplication;
    }
    
    @Override
    public void save() {
        javaApplication.saveObject();
    }

    @Override
    public void load() {
        javaApplication.getObject();
    }

    @Override
    public void update() {
        javaApplication.updateObject();
    }

    @Override
    public void remove() {
        javaApplication.removeObject();
    }
}
