import Enums.Treasure;
import Implements.Weapon;
import Interfaces.IImplement;
import Players.Warrior.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDwarf {

    private Dwarf dwarf;
    private Dwarf dwarf2;


    private Weapon weapon;

    private Treasure treasure;
    @Before
    public void before() {
       dwarf = new Dwarf("Gandalf");
       dwarf2 = new Dwarf("Dwarf");

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
        dwarf.attack(dwarf2, weapon);
        assertEquals(95, dwarf2.getHealthPoint());

    }

}
