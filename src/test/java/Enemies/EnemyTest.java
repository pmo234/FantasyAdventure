package Enemies;
import org.junit.Before;
import org.junit.Test;
import players.Fighters.Barbarian;
import players.Mages.Mage;
import players.Mages.Warlock;
import players.Player;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Enemy enemy;
    Enemy enemy2;
    Player player1;
    Player player2;
    @Before
    public void before() {
        enemy = new Goop(10, 2);
        enemy2 = new Troll(12, 5);
        player1 = new Warlock("Steve The Warlock", 23, 7);
        player2 = new Barbarian("Steve The Barbarian", 30, 2);

    }

    @Test
    public void hasAName() {
        assertEquals(2, enemy.getAttackPWR());
    }

    @Test
    public void hasHP() {
        assertEquals(12, enemy2.getHP());
    }

    @Test
    public void takesDamage(){
        assertEquals(8,enemy.takesDamage(player2));

    }
    @Test
    public void playerAttacksPlayer(){
        assertEquals(21,player1.takesDamage(player2));

    }
    @Test
    public void enemyAttacksEnemy(){
        assertEquals(10,enemy.takesDamage(enemy2));

    }
//    @Test
//    public void takesDamage2(){
//        assertEquals(5,enemy.takesDamage(player1));
//
//    }

}