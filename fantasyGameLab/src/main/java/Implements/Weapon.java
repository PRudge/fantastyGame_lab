package Implements;

import Interfaces.IImplement;
import Players.Player;

public class Weapon implements IImplement {

    private String name;
    private int value;

    public Weapon(String name, int value){
        this.name = name;
        this.value =  value;
    }

    public String getWeapon() {
        return this.name;
    }

    public int getValue() {
        return value;
    }

    public void doDamage(Player player){
        player.removeHealth(value);

    }
}
