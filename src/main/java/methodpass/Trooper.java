package methodpass;

public class Trooper {
    private String name;
    private Position position;

    public Trooper(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("name error");
        }
        this.name = name;
        this.position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("argument error");
        }
        this.position = target;
    }

    public double distanceFrom(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("argument error");
        }
        return this.getPosition().distanceFrom(target);
    }

    private boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
