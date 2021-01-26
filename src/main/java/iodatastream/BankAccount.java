package iodatastream;

public class BankAccount {
    private String acc;
    private String name;
    private double balance;

    public BankAccount(String acc, String name, double balance) {
        this.acc = acc;
        this.name = name;
        this.balance = balance;
    }


    public String getOwner() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return acc;
    }
}
