package players.Fighters;

import Behaviours.IAttack;
import Weapons.Weapons;
import players.Player;

public abstract class Fighter extends Player implements IAttack {

    Weapons weapon;
    public Fighter(String name, int HP) {
        super(name, HP);
        this.weapon = Weapons.CLUB;

    }
}
