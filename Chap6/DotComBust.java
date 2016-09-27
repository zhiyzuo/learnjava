import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList dotComsList = new ArrayList();
    private int numOfGuesses;

    private void setUpGame() {
        // create DotCom objects
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Sink the three dot coms.");
        System.out.println("Pets.com; eToys.com; Go2.com");
        System.out.println("Try to sink them all asap");

        // assign locations for each of the dot coms
        for (int i = 0; i < dotComsList.size(); i++) {
            ArrayList newLocation = helper.placeDotCom(3);
            DotCom dotComToSet = (DotCom) dotComsList.get(i);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while(!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }

        finishGame();
    }

    private void checkUserGuess(String userGuess) { 
        numOfGuesses++;
        String result = "miss";

        for (int i = 0; i < dotComsList.size(); i++) {
            DotCom dotComToTest = (DotCom) dotComsList.get(i);
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }

            if (result.equals("kill")) {
                dotComsList.remove(i);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead!");
        System.out.println("Took you " + numOfGuesses + " of guesses");
    }

    public static void main (String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
