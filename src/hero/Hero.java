package hero;

import models.Player;

public class Hero extends Player {
    public Hero(String name, String weapon, int level, double health, boolean isAlive) {
        super(name, weapon, level, health, isAlive);
    }

    public void showAccess() {
        // train();  — nu merge, e default și clasa e în alt pachet
        rest();   //  — merge, pentru că e protected și clasa e moștenită
        System.out.println("Protected method 'rest()' is accessible in subclass.");
    }
}
