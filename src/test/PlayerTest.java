package test;

import model.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    private Player testPlayer;

    @Before
    public void setup() {
        testPlayer = new Player("testPlayer@example.com", "Test Player");
    }

    @Test
    public void testPlayerConstructor() {
        assertEquals("Test Player", testPlayer.getName());
        assertEquals("testPlayer@example.com", testPlayer.getEmail());
        testPlayer.setName("Foo Buzz");
        assertEquals("Foo Buzz", testPlayer.getName());
        assertEquals(0, testPlayer.getScore());
    }

    @Test
    public void testGetSetScore() {
        assertEquals(0, testPlayer.getScore());
        testPlayer.setScore(1);
        assertEquals(1, testPlayer.getScore());
    }

}
