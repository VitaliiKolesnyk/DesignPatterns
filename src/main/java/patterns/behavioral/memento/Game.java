package patterns.behavioral.memento;

public class Game {
    private String level;
    private long ms;
    
    public void set(String level, long ms) {
        this.level = level;
        this.ms = ms;
    }
    
    public void load(Save save) {
        level = save.getLevel();
        ms= save.getMs();
    }
    
    public Save save() {
        return new Save(level, ms);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", ms=" + ms +
                '}';
    }
}
