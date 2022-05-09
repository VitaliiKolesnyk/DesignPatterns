package patterns.behavioral.command;

import patterns.behavioral.command.command.DeleteCommand;
import patterns.behavioral.command.command.InsertCommand;
import patterns.behavioral.command.command.SelectCommand;
import patterns.behavioral.command.command.UpdateCommand;
import patterns.behavioral.command.entity.CommandManager;
import patterns.behavioral.command.entity.Database;
import patterns.behavioral.command.entity.Developer;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        CommandManager commandManager = new CommandManager();

        Developer developer = new Developer(
                new SelectCommand(database),
                new InsertCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database),
                commandManager
        );
        
        commandManager.printStack();

        developer.insert();
        developer.select();
        developer.update();
        developer.delete();

        commandManager.printStack();
    }
}
