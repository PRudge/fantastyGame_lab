package Players.Warrior;


import Interfaces.IHealth;
import Interfaces.IImplement;

public class Barbarian extends Warrior {


    public Barbarian(String name){
       super(name);
    }

    public void removeHealth(int healthPoint){
        double hitcount = healthPoint;
        this.healthPoint -= hitcount;
    }

    public void attack(IHealth player, IImplement implement){
        int points = implement.getValue() * 2;
        player.removeHealth(points);
    }

}
