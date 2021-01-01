package abstractclass;

public final class Point {
    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long distance(Point p) {
        return (long) Math.sqrt(
                Math.pow((double) x - p.getX(), 2) +
                        Math.pow((double) y - p.getY(), 2)
        );
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
