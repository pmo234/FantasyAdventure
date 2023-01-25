package players.Fighters;

import Behaviours.IAttack;
import Weapons.Weapons;

public class Barbarian extends Fighter {
    public Barbarian(String name, int HP, int attackPwr) {
        super(name, HP, attackPwr);
    }

    @Override
    public double attack() {
        return this.weapon.getPower()*this.attackPwr;
    }


    @Override
    public double takesDamage() {
        return 0;
    }
}
