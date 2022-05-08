package patterns.behavioral.chainOfResponsibility.notifier;

import patterns.behavioral.chainOfResponsibility.priority.Priority;

public class EmailNotifier extends Notifier {
    public EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notyfying using email - " + message);
    }
}
