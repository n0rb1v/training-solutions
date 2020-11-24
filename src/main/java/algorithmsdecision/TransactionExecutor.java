package algorithmsdecision;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for (Transaction item : transactions) {
            BankAccount account = findInList(item.getAccountNumber(), accounts);
            if (item.isCredit()) {
                if (account.deposit(item.getAmount())) {
                    item.setStatus(TransactionStatus.SUCCEEDED);
                }else {
                    item.setStatus(TransactionStatus.PENDING);
                }
            }
            if (item.isDebit()) {
                if (account.withdraw(item.getAmount())) {
                    item.setStatus(TransactionStatus.SUCCEEDED);
                } else {
                    item.setStatus(TransactionStatus.PENDING);
                }
            }

        }
    }

    public BankAccount findInList(String s, List<BankAccount> accounts) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(s)) {
                return acc;
            }
        }
        return null;
    }
}
