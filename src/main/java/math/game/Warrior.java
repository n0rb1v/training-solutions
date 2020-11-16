package math.game;

import java.util.Random;

public class Warrior {
    private String name;
    private int stamina;
    private double skill;
    private Point position;

    private final Random rnd = new Random();

    public Warrior(String name, Point point) {
        this.name = name;
        this.stamina = rnd.nextInt(80) + 20;
        this.skill = rnd.nextDouble();
        this.position = point;
    }

    public Point getPosition() {
        return position;
    }

    public void move(Warrior w) {
        int newX = position.getX();
        int newY = position.getY();
        if (w.getPosition().getX() - position.getX() > 0) {
            newX++;
        } else if (w.getPosition().getX() - position.getX() < 0) {
            newX--;
        }
        if (w.getPosition().getY() - position.getY() > 0) {
            newY++;
        } else if (w.getPosition().getY() - position.getY() < 0) {
            newY--;
        }
        position = new Point(newX, newY);
    }

    public void attack(Warrior w) {
        if (rnd.nextDouble() < skill) {
            w.stamina -= rnd.nextInt(3) + 1;
        }
    }

    public double distance(Warrior w) {
        return position.distance(w.position);
    }

    public boolean isAlive() {
        return stamina > 0;
    }

    public String toString() {
        return name + ": (" + position.getX() + "," + position.getY() + ") " + stamina;
    }
}
