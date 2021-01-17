package exceptionclass.bank2;

import exceptionclass.ErrorCode;
import exceptionclass.InvalidBankOperationException;

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

    public double deposit(double amount) throws InvalidAmountBankOperationException {
        if (amount < 1) {
            throw new InvalidAmountBankOperationException("amount");
        }
        this.balance += amount;
        return this.balance;
    }

    public double subtract(double amount) throws InvalidAmountBankOperationException, LowBalanceBankOperationException {
        if (amount > this.maxSubtract || amount < 1) {
            throw new InvalidAmountBankOperationException("amount");
        }
        double balanceAfter = this.balance - amount;
        if (balanceAfter < 0) {
            throw new LowBalanceBankOperationException("balance");
        }
        this.balance = balanceAfter;
        return this.balance;
    }

    public void setMaxSubtract(double maxSubtract) throws InvalidAmountBankOperationException {
        if (maxSubtract < 1) {
            throw new InvalidAmountBankOperationException("amount");
        }
        this.maxSubtract = maxSubtract;
    }
}
