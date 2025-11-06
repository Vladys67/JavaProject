import hero.Hero;
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

        // metodă default — merge doar în același pachet
        // p1.train(); //  NU merge (Main e în alt pachet)

        // metodă protected — NU merge direct din alt pachet
        // p1.rest(); //  NU merge (nu e subclass)

        // metodă private — NU merge niciodată în afara clasei
        // p1.respawn(); // NU merge

        //  Demonstrăm accesul prin clasa derivată
        Hero hero = new Hero("Lara", "bow", 2, 100, true);
        hero.showAccess(); //  poate accesa metoda protected din Player


    }
}