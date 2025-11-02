package models;
public class Player {
    String name;
    String weapon;
    int level;
    double health;
    boolean isAlive;


    public Player(String name,String weapon,int level,double health,boolean isAlive) {
        this.name = name;
        this.weapon = weapon;
        this.level = level;
        this.health = health;
        this.isAlive = isAlive;

    }

    public Player(){

    }


    public void attack() {
        System.out.println("Player " + name + " armed with weapon " + weapon + " with level " + level + " is attacking the enemy.");
    }

    public void die(){
        isAlive = false;
        System.out.println("Player " + name + " armed with a  " + weapon + " and with health " + health +  " dies defeated ");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getWeapon(){
        return weapon;
    }

    public void setWeapon(String weapon){
        this.weapon=weapon;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level=level;
    }

    public double getHealth(){
        return health;
    }

    public void setHealth(double health){
        this.health = health;
    }

    public boolean getAlive(){
        return isAlive;
    }

    public void setAlive(boolean isAlive){
        this.isAlive=isAlive;
    }
}

