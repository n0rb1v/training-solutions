package week15d05;

public class Battle {
    private int number;
    private String attacker1;
    private String attacker2;
    private String attacker3;
    private String attacker4;
    private String defender1;
    private String defender2;
    private String defender3;
    private String defender4;

    public Battle(int number, String attacker1, String attacker2, String attacker3, String attacker4, String defender1, String defender2, String defender3, String defender4) {
        this.number = number;
        this.attacker1 = attacker1;
        this.attacker2 = attacker2;
        this.attacker3 = attacker3;
        this.attacker4 = attacker4;
        this.defender1 = defender1;
        this.defender2 = defender2;
        this.defender3 = defender3;
        this.defender4 = defender4;
    }

    @Override
    public String toString() {
        return "Battle{" +
                "number=" + number +
                ", attacker1='" + attacker1 + '\'' +
                ", attacker2='" + attacker2 + '\'' +
                ", attacker3='" + attacker3 + '\'' +
                ", attacker4='" + attacker4 + '\'' +
                ", defender1='" + defender1 + '\'' +
                ", defender2='" + defender2 + '\'' +
                ", defender3='" + defender3 + '\'' +
                ", defender4='" + defender4 + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public String getAttacker1() {
        return attacker1;
    }

    public String getAttacker2() {
        return attacker2;
    }

    public String getAttacker3() {
        return attacker3;
    }

    public String getAttacker4() {
        return attacker4;
    }

    public String getDefender1() {
        return defender1;
    }

    public String getDefender2() {
        return defender2;
    }

    public String getDefender3() {
        return defender3;
    }

    public String getDefender4() {
        return defender4;
    }
}
