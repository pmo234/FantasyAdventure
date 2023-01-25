package Enemies;

public class Goop extends Enemy {
    public Goop(int HP, int attackPWR) {
        super(HP, attackPWR);
    }

    @Override
    public double attack() {
        return getAttackPWR();
    }

    @Override
    public double takesDamage() {
        return 0;
    }
}
