package patterns.behavioral.chainOfResponsibility.notifier;

import patterns.behavioral.chainOfResponsibility.priority.Priority;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notyfying using simple report - " + message);
    }
}
