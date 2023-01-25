package players.Clerics;

public class Priest extends Cleric{
    public Priest(String name, int HP) {
        super(name, HP);
    }

    @Override
    public double heal() {
        return 0;
    }
}
