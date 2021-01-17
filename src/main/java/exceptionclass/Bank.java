package exceptionclass;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null){
            throw new IllegalArgumentException("accounts");
        }
        this.accounts = accounts;
    }

    private Account get(String acc) throws InvalidBankOperationException {
        for (Account item: accounts){
            if (acc.equals(item.getAccountNumber())){
                return item;
            }
        }
        throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
    }

    public void payment(String acc, double amount) throws InvalidBankOperationException {
        Account account = get(acc);
        account.subtract(amount);
    }

    public void deposit(String acc,double amount) throws InvalidBankOperationException {
        Account account = get(acc);
        account.deposit(amount);
    }

}
