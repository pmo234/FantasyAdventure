package players.Mages;

public class Wizard extends Mage{
    public Wizard(String name, int HP, int attackPwr) {
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
