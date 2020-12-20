package week08d01;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void up() {
        y++;
    }
    public void down() {
        y--;
    }
    public void left() {
        x--;
    }
    public void right() {
        x++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
