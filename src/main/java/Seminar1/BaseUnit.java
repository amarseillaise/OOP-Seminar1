package Seminar1;

abstract public class BaseUnit {
    protected int attack;
    protected int defence;
    protected int[] damage;
    protected float health;
    protected int speed;

    public BaseUnit(int attack, int defence, int[] damage, int health, int speed) {
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return  "Atc: " + attack +
                "Dfn: " + defence +
                "Dmg: " + (damage[0] + damage[1]) / 2 +
                "Hlt: " + health +
                "Sp: " + speed;
    }
}
