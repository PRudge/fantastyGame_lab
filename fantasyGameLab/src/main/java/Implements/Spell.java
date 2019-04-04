package Implements;

import Interfaces.IImplement;
import Players.Player;

public class Spell implements IImplement {

    private String name;
    private int value;

    public Spell(String name, int value){
        this.name = name;
        this.value =  value;
    }

    public String getSpell() {
        return this.name;
    }

    public int getValue() {
        return value;
    }

    public void doDamage(Player player){
        player.removeHealth(value);

    }
}
