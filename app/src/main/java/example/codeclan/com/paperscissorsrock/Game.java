package example.codeclan.com.paperscissorsrock;

import java.util.Random;

/**
 * Created by user on 18/01/2017.
 */

public class Game
{
    private int playerChoice;
    private int computerChoice;
    private Random random;

    public Game() {
        random = new Random();
        computerChoice = random.nextInt(3) + 1;
        playerChoice = 0;
    }

    public String runGame(int playerChoice, int computerChoice){
        if (playerChoice == 1 && computerChoice == 1) {
            return "player chose rock computer chose rock so you draw";
        } else if (playerChoice == 1 && computerChoice == 2) {
            return "player chose rock computer chose paper so you lose";
        } else if (playerChoice == 1 && computerChoice == 3) {
            return "player chose rock computer chose scissors so you win";
        } else if (playerChoice == 2 && computerChoice == 2) {
            return "player chose paper computer chose paper so you draw";
        } else if (playerChoice == 2 && computerChoice == 3) {
            return "player chose paper computer chose scissors so you lose";
        } else if (playerChoice == 3 && computerChoice == 3) {
            return "player chose scissors computer chose scissors so you draw";
        } else {
            return "you have broken the game";
        }
    }
}
