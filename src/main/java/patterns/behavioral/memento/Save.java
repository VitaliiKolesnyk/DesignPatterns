package patterns.behavioral.memento;

public class Save {
    private final String level;
    private final long ms;

    public Save(String level, long ms) {
        this.level = level;
        this.ms = ms;
    }

    public String getLevel() {
        return level;
    }

    public long getMs() {
        return ms;
    }
}
