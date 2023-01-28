package players.Fighters;

import Enemies.Enemy;
import Enemies.Goop;
import Weapons.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponsTest {
    Barbarian barbarian;
    Enemy enemy;
    Weapons weapon;

    @Before
    public void before() {
        barbarian = new Barbarian("Steve The Barbarian", 10, 3);
        enemy = new Goop(10, 2);

    }

    @Test
    public void canGetAllWeapons() {
        assertEquals("Steve The Barbarian", weapon.getAllWeapons());
    }
}