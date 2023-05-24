package efs.task.oop;

public abstract class Monster implements Fighter {
    private int health;
    private final int damage;
    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    @Override
    public void attack(Fighter victim) {
        victim.takeHit(damage);
    }
    @Override
    public void takeHit(int damage) {
        health -= damage;
    }
}

