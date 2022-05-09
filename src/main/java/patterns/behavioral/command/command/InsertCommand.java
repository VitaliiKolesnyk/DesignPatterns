package patterns.behavioral.command.command;

import patterns.behavioral.command.entity.Database;

public class InsertCommand implements Command {
    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
