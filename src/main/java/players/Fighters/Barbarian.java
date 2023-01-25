package players.Fighters;

import Behaviours.IAttack;

public class Barbarian extends Fighter {
    public Barbarian(String name, int HP) {
        super(name, HP);
    }

    @Override
    public double attack() {
        return 0;
    }
}
