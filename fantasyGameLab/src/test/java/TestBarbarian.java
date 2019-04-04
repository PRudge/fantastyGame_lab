import Enums.Treasure;
import Implements.Weapon;
import Players.Warrior.Barbarian;
import Players.Warrior.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBarbarian {

    private Dwarf dwarf;
    private Barbarian barbarian;


    private Weapon weapon;

    private Treasure treasure;
    @Before
    public void before() {
       dwarf = new Dwarf("Gandalf");
       barbarian = new Barbarian("Dwarf");

       weapon = new Weapon("sword", 10);


       treasure = Treasure.RUBY;
    }

    @Test
    public void canGetHealth(){
        assertEquals(100,dwarf.getHealthPoint());
    }

    @Test
    public void canGetTreasures(){
        assertEquals(0, dwarf.getTreasures());
    }

    @Test
    public void canAddTreasure(){
        dwarf.addTreasure(treasure);
        assertEquals(1, dwarf.getTreasures());
    }

    @Test
    public void canCountTreasure(){
        dwarf.addTreasure(treasure);
        dwarf.addTreasure(treasure);
        assertEquals(20, dwarf.countTreasure());
    }

    @Test
    public void canAttack(){
        barbarian.attack(dwarf, weapon);
        assertEquals(90, dwarf.getHealthPoint());

    }

}
