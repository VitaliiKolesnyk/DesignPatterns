package patterns.behavioral.chainOfResponsibility.priority;

public enum Priority {
    ROUTINE(1),
    IMPORTANT(2),
    ASAP(3);
    
    private int priority;
    
    Priority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
