import Enums.Treasure;
import Implements.Weapon;
import Players.Warrior.Dwarf;
import Players.Warrior.Knight;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestKnight {

    private Dwarf dwarf;
    private Knight knight;


    private Weapon weapon;

    private Treasure treasure;
    @Before
    public void before() {
       dwarf = new Dwarf("Gandalf");
       knight = new Knight("Dwarf");

       weapon = new Weapon("sword", 10);


       treasure = Treasure.EMERALD;
    }

    @Test
    public void canGetHealth(){
        assertEquals(100,knight.getHealthPoint());
    }

    @Test
    public void canGetTreasures(){
        assertEquals(0, knight.getTreasures());
    }

    @Test
    public void canAddTreasure(){
        knight.addTreasure(treasure);
        assertEquals(1, knight.getTreasures());
    }

    @Test
    public void canCountTreasure(){
        dwarf.addTreasure(treasure);
        knight.addTreasure(treasure);
        assertEquals(15, dwarf.countTreasure());
    }

    @Test
    public void canAttack(){
        dwarf.attack(knight, weapon);
        assertEquals(90, knight.getHealthPoint());

    }

}
