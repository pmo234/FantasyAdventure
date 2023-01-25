package players.Clerics;

import Behaviours.IHeal;
import players.Player;

public abstract class Cleric extends Player implements IHeal {
    public Cleric(String name, int HP) {
        super(name, HP);
    }
}
