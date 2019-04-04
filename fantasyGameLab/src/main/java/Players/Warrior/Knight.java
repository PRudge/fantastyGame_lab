package Players.Warrior;


import Interfaces.IHealth;
import Players.Player;


public class Knight extends Warrior {


    public Knight(String name){
        super(name);
    }

    public void removeHealth(int healthPoint){
        double hitcount = healthPoint;
        this.healthPoint -= hitcount;
    }

}

