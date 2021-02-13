package week15d05;

public class Battle {
    private String attacker;
    private int count;

    public Battle(String attacker) {
        this.attacker = attacker;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return attacker + ":" + count;
    }

    public void setCountpp() {
        this.count++;
    }
}
