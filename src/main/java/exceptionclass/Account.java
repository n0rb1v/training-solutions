package exceptionclass;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("accountNumber");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public double deposit(double amount) throws InvalidBankOperationException {
        if (amount < 1) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        this.balance += amount;
        return this.balance;
    }

    public double subtract(double amount) throws InvalidBankOperationException {
        if (amount > this.maxSubtract || amount < 1){
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        double balanceAfter = this.balance - amount;
        if (balanceAfter < 0) {
            throw new InvalidBankOperationException(ErrorCode.LOW_BALANCE);
        }
        this.balance = balanceAfter;
        return this.balance;
    }

    public void setMaxSubtract(double maxSubtract) throws InvalidBankOperationException {
        if (maxSubtract < 1){
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        this.maxSubtract = maxSubtract;
    }
}
