package model;

import java.util.HashMap;

public class Board {
    private HashMap<Integer, Piece> squares;

    public Board() {
        initBoard();
    }

    private void initBoard() {
        //
    }

    public boolean isSquareEmpty() { return false; }

    public Piece readSquare(int row, int col) { return null; }

    public void updateSquare(Piece piece, int row, int col) { ; }

    public void resetBoard() { ; }

}
