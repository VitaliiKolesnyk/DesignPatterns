package patterns.behavioral.chainOfResponsibility.notifier;

import patterns.behavioral.chainOfResponsibility.priority.Priority;

public class SmsNotifier extends Notifier {
    public SmsNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notyfying using SMS - " + message);
    }
}
