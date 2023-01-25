package players;

import Behaviours.ITakeDamage;
import Enemies.Enemy;
import players.Fighters.Fighter;
import players.Mages.Mage;

public abstract class Player implements ITakeDamage {
    private String name;
    private int HP;

    public Player(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    public int takesDamage(ITakeDamage character){
//        System.out.println(character.getClass());
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
