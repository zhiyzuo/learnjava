import java.util.ArrayList;

public class DotCom {

    private ArrayList locationCells;
    private String name;
    // private int numOfHits = 0;

    public void setLocationCells(ArrayList locs) {
        locationCells = locs;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String status = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                status = "kill";
                System.out.println("You sunk " + name + "!");
            } else {
                status = "hit";
            }
        }

        return status;
    }
}
