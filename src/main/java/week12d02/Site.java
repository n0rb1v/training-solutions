package week12d02;

public class Site {
    private int odd;
    private int length;
    private Fence fence;

    public Site(int odd, int length, Fence fence) {
        this.odd = odd;
        this.length = length;
        this.fence = fence;
    }

    public int getOdd() {
        return odd;
    }

    public int getLength() {
        return length;
    }

    public Fence getFence() {
        return fence;
    }
}
