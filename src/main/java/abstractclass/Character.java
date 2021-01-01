package abstractclass;

import java.util.Random;

public abstract class Character {
    private Point position;
    private int hitPoint;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.hitPoint = 100;
        this.random = random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(9) + 1;
    }

    private int getActualDefence() {
        return random.nextInt(5);
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }
    abstract public void secondaryAttack(Character enemy);

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }
}
