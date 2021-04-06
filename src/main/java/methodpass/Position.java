package methodpass;

public class Position {
    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position p) {
        if (p == null) {
            throw new IllegalArgumentException("position error");
        }
        return Math.sqrt(Math.pow(this.posX - p.posX, 2) + Math.pow(this.posY - p.posY, 2));
    }
}
