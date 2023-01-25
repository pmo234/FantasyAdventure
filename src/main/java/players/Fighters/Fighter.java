package players.Fighters;

import Behaviours.IAttack;
import Weapons.Weapons;
import players.Player;

public abstract class Fighter extends Player implements IAttack {

    Weapons weapon;
    int attackPwr;
    public Fighter(String name, int HP, int attackPwr) {
        super(name, HP);
        this.weapon = Weapons.CLUB;
        this.attackPwr = attackPwr;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }
}
