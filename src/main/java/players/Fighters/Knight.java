package players.Fighters;

public class Knight extends Fighter{
    public Knight(String name, int HP, int attackPWR) {
        super(name, HP,attackPWR);
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
