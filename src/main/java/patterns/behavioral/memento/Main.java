package patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("Level 2", 3000000L);
        System.out.println(game);
        
        File file = new File();
        file.setSave(game.save());
        
        game.set("Level 3", 50000000L);
        game.load(file.getSave());
        
        System.out.println(game);
    }
}
