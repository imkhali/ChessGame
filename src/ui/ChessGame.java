package ui;

import model.Board;
import model.Game;
import model.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChessGame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 700;

    private Board board;

    public ChessGame() {
        super("Chess Game");
        initializeGraphics();
    }

    private void initializeGraphics() {
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        board = new Board();
        add(board, BorderLayout.CENTER);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChessGame();
    }
}


//    public static void main(String[] args) {
//        Player firstPlayer = new Player("first@example.com", "first player");
//        Player secondPlayer = new Player("second@example.com", "second player");
//        Game game = new Game(Arrays.asList(firstPlayer, secondPlayer));
//        game.start();
//        game.end();
//
//        Game game2 = new Game();
//        game2.addPlayer(firstPlayer);
//        game2.addPlayer(secondPlayer);
//        game2.withdrawPlayer("");
//        game2.start();
//
//        if (game2.isActivePlayer(firstPlayer))
//            System.out.println("first player is active");
//        while (!game2.isGameOver()) {
//            // for testing
//            System.out.println("please enter your movement as 4 numbers: fromRow, fromCol, toRow, toCol ");
//            Scanner scanner = new Scanner(System.in);
//            String line = scanner.nextLine();
//            String[] strings = line.split(", ");
//            scanner.close();
//            game2.movePiece(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), Integer.parseInt(strings[3]));
//            System.out.println("I will move piece from r: " + strings[0] + ", c: " + strings[1] + " to r: " + strings[2] + ", ");
//            game2.end();
//        }
//    }
