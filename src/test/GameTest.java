package test;

import model.Board;
import org.junit.Before;

public class GameTest {
    private Board testBoard;

    @Before
    public void setup() {
        testBoard = new Board();
    }
}
