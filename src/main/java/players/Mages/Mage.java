package players.Mages;

import Behaviours.ISpell;
import players.Player;

public abstract class Mage extends Player implements ISpell {
    public Mage(String name, int HP) {
        super(name, HP);
    }
}
