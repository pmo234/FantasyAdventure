package players.Mages;

public class Warlock extends Mage{
    public Warlock(String name, int HP) {
        super(name, HP);
    }

    @Override
    public double spell() {
        return 0;
    }
}
