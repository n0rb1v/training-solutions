package week12d02;

public class Report {
    private Fence fence;
    private int number;

    public Report(Fence fence, int number) {
        this.fence = fence;
        this.number = number;
    }

    public Fence getFence() {
        return fence;
    }

    public void setFence(Fence fence) {
        this.fence = fence;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
