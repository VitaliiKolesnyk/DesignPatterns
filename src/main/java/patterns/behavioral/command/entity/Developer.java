package patterns.behavioral.command.entity;

import patterns.behavioral.command.command.Command;

public class Developer {
    private Command select;
    private Command insert;
    private Command update;
    private Command delete;
    private CommandManager commandManager;

    public Developer(Command select, Command insert, Command update, Command delete, CommandManager commandManager) {
        this.select = select;
        this.insert = insert;
        this.update = update;
        this.delete = delete;
        this.commandManager = commandManager;
    }
    
    public void select() {
        select.execute();
        commandManager.add(select);
    }
    
    public void insert() {
        insert.execute();
        commandManager.add(insert);
    }
    
    public void update() {
        update.execute();
        commandManager.add(update);
    }
    
    public void delete() {
        delete.execute();
        commandManager.add(delete);
    }
}
