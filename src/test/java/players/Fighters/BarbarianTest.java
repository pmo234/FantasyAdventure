package players.Fighters;

import Enemies.Enemy;
import Enemies.Goop;
import Weapons.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Enemy enemy;

    @Before
    public void before() {
        barbarian = new Barbarian("Steve The Barbarian", 10, 3);
        enemy = new Goop(10, 2);

    }

    @Test
    public void hasAName() {
        assertEquals("Steve The Barbarian", barbarian.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(10, barbarian.getHP());
    }

    @Test
    public void hasClubAsInitialWeapon() {
        assertEquals(Weapons.CLUB, barbarian.getWeapon());
    }

    @Test
    public void canAttackWithWeapon() {
        assertEquals(3, barbarian.attack(),0.1);
    }
    @Test
    public void canChangeWeapon() {
        barbarian.setWeapon(Weapons.FISH);
        assertEquals(Weapons.FISH, barbarian.getWeapon());
        assertEquals(0.6, barbarian.attack(),0.1);
    }
    @Test
    public void canAttackEnemy() {
        barbarian.setWeapon(Weapons.FISH);
        assertEquals(Weapons.FISH, barbarian.getWeapon());

        assertEquals(0.6, barbarian.attack(),0.1);
    }
    @Test
    public void takesDamage(){
        assertEquals(8,barbarian.takesDamage(enemy));

    }


}