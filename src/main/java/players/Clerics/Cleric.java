package players.Clerics;

import Behaviours.IHeal;
import Behaviours.ITakeDamage;
import players.Player;

public abstract class Cleric extends Player implements IHeal, ITakeDamage {
    public Cleric(String name, int HP) {
        super(name, HP);
    }
}
