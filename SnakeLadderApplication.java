import model.Game;

public class SnakeLadderApplication {
    public static void main(String args[]) {
        Game game = new Game();
        game.setDice(2);
        game.setBoard(100, 4, 3);
        game.addPlayers(1, "Akshay");
        game.addPlayers(2, "Chaitra");
        game.addPlayers(3, "Reshal");
        game.addPlayers(4, "Ajay");
        game.startGame();


    }
}