package algorithmsdecision;

import java.time.LocalDateTime;

public class Transaction {
    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;
    private LocalDateTime dateOfTransaction;
    private TransactionStatus status;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
        this.status = status;
    }

    public boolean isCredit() {
        return transactionOperation == transactionOperation.CREDIT;
    }

    public boolean isDebit() {
        return transactionOperation.toString().equals("DEBIT");
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

}
