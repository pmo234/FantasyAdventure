package Enemies;

public class Troll extends Enemy{
    public Troll(int HP, int attackPWR) {
        super(HP, attackPWR);
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
