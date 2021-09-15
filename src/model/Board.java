package model;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class Board extends JPanel {
    public static final int NUM_ROWS_COLS = 8;
    public static final int topDownMargin = 2;
    public static final int leftRightMargin = 2;
    public static final int[][] ROWS = {
            {0, 1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20, 21, 22, 23},
            {24, 25, 26, 27, 28, 29, 30, 31},
            {32, 33, 34, 35, 36, 37, 38, 39},
            {40, 41, 42, 43, 44, 45, 46, 47},
            {48, 49, 50, 51, 52, 53, 54, 55},
            {56, 57, 58, 59, 60, 61, 62, 63},
    };
    public static final int[][] COLS = {
            {0, 8, 16, 24, 32, 40, 48, 56},
            {1, 9, 17, 25, 33, 41, 49, 57},
            {2, 10, 18, 26, 34, 42, 50, 58},
            {3, 11, 19, 27, 35, 43, 51, 59},
            {4, 12, 20, 28, 36, 44, 52, 60},
            {5, 13, 21, 29, 37, 45, 53, 61},
            {6, 14, 22, 30, 38, 46, 54, 62},
            {7, 15, 23, 31, 39, 47, 55, 63},
    };
    private static final int NUM_QUEENS = 8;
    private final int[] data = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0,
    };

    private final HashMap<Integer, Piece> pieces;

    public Board() {
        super();
        pieces = new HashMap<>();
        setBackground(Color.WHITE);
        initBoard();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
        for (Piece piece : pieces.values()) {
            piece.draw();
        }
    }

    // TODO: refactor this mess
    private void drawBoard(Graphics g) {
        Color save = g.getColor();

        int drawingWidth = getWidth() - 2 * leftRightMargin;
        int drawingHeight = getHeight() - 2 * topDownMargin;

        int cellWidth = drawingWidth / NUM_ROWS_COLS;
        int cellHeight = drawingHeight / NUM_ROWS_COLS;

        int leftOverWidth = (getWidth() - 2 * leftRightMargin - cellWidth * NUM_ROWS_COLS) / 2;
        int leftOverHeight = (getHeight() - 2 * topDownMargin - cellHeight * NUM_ROWS_COLS) / 2;

        int startDrawingX = leftRightMargin + leftOverWidth;
        int stopDrawingX = drawingWidth + leftRightMargin + leftOverWidth;
        int startDrawingY = topDownMargin + leftOverHeight;
        int stopDrawingY = drawingHeight + topDownMargin + leftOverHeight;

        int rowNumber = 0;
        int colNumber = 0;
        for (int x = startDrawingX; x < stopDrawingX && rowNumber < NUM_ROWS_COLS; x += cellWidth) {
            for (int y = startDrawingY; y < stopDrawingY && colNumber < NUM_ROWS_COLS; y += cellHeight) {
                if ((rowNumber + colNumber) % 2 == 0) {
                    g.setColor(new Color(255, 228, 196));
                } else {
                    g.setColor(new Color(160, 82, 45));
                }
                g.fillRect(x, y, cellWidth, cellHeight);
                g.setColor(save);
                colNumber++;
            }
            colNumber = 0;
            rowNumber++;
        }
        g.setColor(save);
    }

    private void initBoard() {
        //
    }

    public HashMap<Integer, Piece> getPieces() {
        return pieces;
    }

    public boolean isCellEmpty() { return false; }

    public Piece readCell(int row, int col) { return null; }

    public void fillCell(int row, int col, Piece piece) {
        // if boardInCheckmate, notify game
    }

    public void clearCell(int row, int col) { ; }

    public boolean containsPiece(Piece piece) { return false; }

    public boolean isBoardInCheckmate() {
        return false;
    }

    public void resetBoard() { ; }

}
