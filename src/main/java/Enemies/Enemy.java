package Enemies;

import Behaviours.IAttack;
import Behaviours.ITakeDamage;
import players.Fighters.Fighter;
import players.Mages.Mage;
import players.Player;

public abstract class Enemy implements IAttack, ITakeDamage {
    private int HP;
    private int attackPWR;

    public Enemy(int HP, int attackPWR) {
        this.HP = HP;
        this.attackPWR = attackPWR;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttackPWR() {
        return attackPWR;
    }

    public void setAttackPWR(int attackPWR) {
        this.attackPWR = attackPWR;
    }

    public int takesDamage(ITakeDamage character){
        System.out.println(character.getClass());
        if(character instanceof Fighter){
            return this.HP -= (((Fighter) character).attack());
        } else if (character instanceof Mage) {
            System.out.println((((Mage) character).spell()));
            return this.HP -= (((Mage) character).spell());
        } else if(character instanceof Enemy){
            return this.HP -= (((Enemy) character).attack());
        }
        else{return this.HP;}
    }

}
