package Players;

import Enums.Treasure;
import Interfaces.IHealth;
import Interfaces.IImplement;

import java.util.ArrayList;

public abstract class Player implements IHealth {

    protected int healthPoint;
    private ArrayList<Treasure> treasures;
    private String name;

    public Player(String name){
        this.healthPoint = 100;
        this.treasures = new ArrayList<>();
        this.name = name;

    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getTreasures() {
        return treasures.size();
    }

    public String getName() {
        return name;
    }

    public void addHealth(int healthPoint){
        this.healthPoint += healthPoint;
    }

    public void removeHealth(int healthPoint){
        this.healthPoint -= healthPoint;
    }

    public void addTreasure(Treasure treasure){
        this.treasures.add(treasure);
    }

    public int countTreasure(){
        int count = 0;
        for (int i = 0; i < this.treasures.size(); i++){
            count += treasures.get(i).getValue();
        }
        return count;
    }

//    public void getHit( IImplement implement){
//
//
//    }
}
