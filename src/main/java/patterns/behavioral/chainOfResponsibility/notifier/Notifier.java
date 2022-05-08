package patterns.behavioral.chainOfResponsibility.notifier;

import patterns.behavioral.chainOfResponsibility.priority.Priority;

public abstract class Notifier {
    private Priority priority;
    private Notifier nextNotifier;

    public Notifier(Priority priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, Priority level) {
        if (level.getPriority() == priority.getPriority()) {
            write(message);
            return;
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
