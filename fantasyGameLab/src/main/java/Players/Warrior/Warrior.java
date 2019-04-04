package Players.Warrior;

import Interfaces.IAttack;
import Interfaces.IHealth;
import Interfaces.IImplement;
import Players.Player;

public abstract class Warrior extends Player implements IAttack {

public Warrior(String name){
    super(name);
}
    public void attack(IHealth player, IImplement implement){
        int points = implement.getValue();
        player.removeHealth(points);
    }

}
