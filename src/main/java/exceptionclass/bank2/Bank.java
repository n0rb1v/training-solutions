package exceptionclass.bank2;

import exceptionclass.InvalidBankOperationException;

import java.util.List;

public class Bank {
    private List<exceptionclass.bank2.Account> accounts;

    public Bank(List<exceptionclass.bank2.Account> accounts) {
        if (accounts == null){
            throw new IllegalArgumentException("accounts");
        }
        this.accounts = accounts;
    }

    private exceptionclass.bank2.Account get(String acc) throws InvalidBankOperationException {
        for (exceptionclass.bank2.Account item: accounts){
            if (acc.equals(item.getAccountNumber())){
                return item;
            }
        }
        throw new InvalidAccountNumberBankOperationException("account");
    }

    public void payment(String acc, double amount) throws InvalidAmountBankOperationException {
        exceptionclass.bank2.Account account = get(acc);
        account.subtract(amount);
    }

    public void deposit(String acc,double amount) throws InvalidAmountBankOperationException {
        Account account = get(acc);
        account.deposit(amount);
    }

}
