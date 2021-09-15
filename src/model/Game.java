package model;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Represents a multiple round game of chess, same players can play multiple rounds
 */
@SuppressWarnings("deprecation")
public class Game implements Observer {
    private List<Player> players;
    private Board board;
    private boolean gameOver;
    private Player activePlayer;

    // Related to life cycle of the game
    public Game(List<Player> players) {

    }
    public Game() {

    }
    public void addPlayer(Player player) {

    }
    public void withdrawPlayer(String playerID) {

    }
    public void start() {
        // init board
//        while (!gameOver) {
//            //
//        }
    }
    public void end() {
        gameOver = true;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    // Related to game while running
    public void movePiece(int rowFrom, int colFrom, int rowTo, int colTo) {
        // if board.isBoardInCheckmate() or activePlayer
        //
    }

    public boolean isActivePlayer(Player player) {
        return false;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
