package patterns.behavioral.command.command;

import patterns.behavioral.command.entity.Database;

public class UpdateCommand implements Command {
    private Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }
    
    @Override
    public void execute() {
        database.update();
    }
}
