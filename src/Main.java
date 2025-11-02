import models.Player;
public class Main {

    public static void main(String[] args) {
        Player p1 = new Player("Jack", "sword", 1, 98.50, true);

        p1.attack();

        Player p2=new Player();
        p2.setName("Tom");
        p2.setWeapon("knife");
        p2.setHealth(0.00);

        p2.die();

    }
}