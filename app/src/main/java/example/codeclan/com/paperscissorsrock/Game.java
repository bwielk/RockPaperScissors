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

    public String runGame(int playerChoice, int computerChoice) {
        if (playerChoice == 1 && computerChoice == 1) {
            return "You chose rock. \nThe computer chose rock. \nYou draw";
        } else if (playerChoice == 1 && computerChoice == 2) {
            return "You chose rock. \nThe computer chose paper. \nYou lose";
        } else if (playerChoice == 1 && computerChoice == 3) {
            return "You chose rock. \nThe computer chose scissors. \nYou win";
        } else if (playerChoice == 2 && computerChoice == 1) {
            return "You chose paper. \nThe computer chose rock. \nYou win";
        } else if (playerChoice == 2 && computerChoice == 2) {
            return "You chose paper. \nThe computer chose paper. \nYou draw";
        } else if (playerChoice == 2 && computerChoice == 3) {
            return "You chose paper. \nThe computer chose scissors. \nYou lose";
        } else if (playerChoice == 3 && computerChoice == 3) {
            return "You chose scissors. \nThe computer chose scissors. \nYou draw";
        } else if (playerChoice == 3 && computerChoice == 1) {
            return "You chose scissors. \nThe computer chose rock. \nYou lose";
        } else if (playerChoice == 3 && computerChoice == 2) {
            return "You chose scissors. \nThe computer chose so. \nYou win";
        }else{
            return "Something is wrong. Try again";
        }
    }
}
