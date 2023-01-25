package players.Fighters;

public class Drawf extends Fighter {
    public Drawf(String name, int HP,int attackPwr) {
        super(name, HP,attackPwr);
    }

    @Override
    public double attack() {
        return 0;
    }

    @Override
    public double takesDamage() {
        return 0;
    }
}
