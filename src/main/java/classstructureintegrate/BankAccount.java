package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int balance) {
        this.balance += balance;
    }
    public void withdraw(int balance) {
        this.balance -= balance;
    }
    public void transfer(BankAccount target,int balance) {
        this.withdraw(balance);
        target.deposit(balance);
    }

    public String getInfo() {
        return accountNumber+"("+owner+"):"+balance;
    }
}
