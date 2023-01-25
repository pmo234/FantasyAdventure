package players.Mages;

import Behaviours.ISpell;
import players.Player;

public abstract class Mage extends Player implements ISpell {
    private int attackPwr;
    public Mage(String name, int HP, int attackPwr) {
        super(name, HP);
        this.attackPwr = attackPwr;
    }
}
