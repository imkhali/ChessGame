package model;

public abstract class Piece {
    private int row;
    private int col;
    private State state;

    public void draw() {
        ;
    }
    public abstract void move();
}
