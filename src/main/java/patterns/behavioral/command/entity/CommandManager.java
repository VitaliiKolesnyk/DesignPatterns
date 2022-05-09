package patterns.behavioral.command.entity;

import patterns.behavioral.command.command.Command;

import java.util.ArrayDeque;

public class CommandManager {
    private ArrayDeque<Command> history = new ArrayDeque<>();
    
    public void add(Command command) {
        history.push(command);
    }
    
    public void printStack() {
        if (!history.isEmpty()) {
            System.out.println(history.size() + " commands:");
            history.stream().forEach(command -> System.out.println(command.getClass().getSimpleName()));
        } else {
            System.out.println("History of actions is empty");
        }
    }
}
