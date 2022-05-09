package patterns.behavioral.command.command;

import patterns.behavioral.command.entity.Database;

public class SelectCommand implements Command {
    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }
    
    @Override
    public void execute() {
        database.select();
    }
}
