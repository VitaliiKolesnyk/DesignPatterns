package patterns.structural.adapter;

public class ApplicationRunner {
    public static void main(String[] args) {
        Database database = new DatabaseToApplicationAdapter(new JavaApplication());
        
        runApplication(database);
    }
    
    public static void runApplication(Database database) {
        database.save();
        database.load();
        database.update();
        database.remove();
    }
}
