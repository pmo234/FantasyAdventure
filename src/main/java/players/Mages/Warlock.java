package players.Mages;

public class Warlock extends Mage{
    public Warlock(String name, int HP, int attackPwr) {
        super(name, HP, attackPwr);
    }

    @Override
    public double spell() {
        return 0;
    }

    @Override
    public double takesDamage() {
        return 0;
    }
}
