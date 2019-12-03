package headfirst.lesson5_gameShips_for;

import java.util.Scanner;

public class Game {

    private int numberOfHits;
    private int[] locations;

    private void setLocations(int[] locationOfShip) {
        locations = locationOfShip;
    }

    private String checkHitting() {
        String result = "Мимо";

        Scanner sc = new Scanner(System.in);
        String attemptString = sc.next();
        int attemptInt = Integer.parseInt(attemptString);

        for (int attempt : locations) {
            if (attempt == attemptInt) {
                result = "Попал";
                numberOfHits++;
            }
            if (numberOfHits == 3) {
                result = "Потопил";
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Game newGame = new Game();
        int[] newLocations = {2, 3, 4};
        newGame.setLocations(newLocations);
        while (!newGame.checkHitting().equals("Потопил")){
        }
    }
}
