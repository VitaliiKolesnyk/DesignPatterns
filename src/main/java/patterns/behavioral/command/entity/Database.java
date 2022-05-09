package patterns.behavioral.command.entity;

public class Database {
    public void select() {
        System.out.println("Selecting from DB...");
    }
    
    public void insert() {
        System.out.println("Inserting to DB...");
    }
    
    public void update() {
        System.out.println("Updating in DB...");
    }
    
    public void delete() {
        System.out.println("Removing from DB...");
    }
}
