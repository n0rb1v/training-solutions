package week06d05;

public class Biscuit {
    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public static Biscuit of(BiscuitType bis, int gram){
        return new Biscuit(bis,gram);
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "type=" + type +
                ", gramAmount=" + gramAmount +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Biscuit.of(BiscuitType.CSOKIS,20));
    }
}
