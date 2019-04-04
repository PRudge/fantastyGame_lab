package Players.Warrior;

import Interfaces.IHealth;
import Players.Player;


public class Dwarf extends Warrior {


    public Dwarf(String name){
       super(name);
    }

    public void removeHealth(int healthPoint){
        double hitcount = healthPoint /2;
        this.healthPoint -= hitcount;
    }

}
