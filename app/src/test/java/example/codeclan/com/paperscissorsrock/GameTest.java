package example.codeclan.com.paperscissorsrock;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by user on 18/01/2017.
 */
public class GameTest {

    int player;
    int computerChoice;
    int computer;
    int player1;
    int computer1;
    Game game;
    Random random;

    @Before
    public void before(){
        game = new Game();
        player = 1;
        random = new Random();
        computerChoice = random.nextInt(3) + 1;
        computer = 1;
        computer1 = 3;
        player1 = 1;
    }

    @Test
    public void playerHasValue(){
        assertNotNull(player);
    }

    @Test
    public void computerHasValue(){
        assertNotNull(computerChoice);
    }

    @Test
    public void gameWorks(){
        assertEquals("player chose rock computer chose rock so you draw",game.runGame(player, computer));
    }

    @Test
    public void gameWorksPart2(){
        assertEquals("player chose rock computer chose scissors so you win",game.runGame(player1, computer1));
    }
}