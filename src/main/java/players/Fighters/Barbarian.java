package players.Fighters;

import Behaviours.IAttack;
import Weapons.Weapons;
import players.Player;

public class Barbarian extends Fighter {
    private static Barbarian instance = null;
    public Barbarian(String name, int HP, int attackPwr) {
        super(name, HP, attackPwr);
    }

    public static Barbarian getInstance() {
        if (instance == null) {
            instance = new Barbarian("Placeholder",20, 5);
        }
        return instance;
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
