package room;

import game.Game;


public class Room {
    private int id;
    private boolean gameStatus;
    private Game game;

    public Room(int id) {
        this.id = id;
        this.gameStatus = false;
    }

    public void startGame() {
        gameStatus = true;

        game = new Game();
    }
}
