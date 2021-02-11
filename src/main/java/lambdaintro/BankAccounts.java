package lambdaintro;

import java.text.Collator;
import java.util.*;

public class BankAccounts {
    private List<BankAccount> bankAccounts;

    public BankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }


    public List<BankAccount> listBankAccountsByAccountNumber() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        Collections.sort(result);
        return result;
    }

    public List<BankAccount> listBankAccountsByBalance() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        result.sort(new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return (int) o1.getBalance() - (int) o2.getBalance();
            }
        });
        return result;

    }

    public List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        Collections.sort(result, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return (int) o1.getBalance() - (int) o2.getBalance();
            }
        });
        Collections.reverse(result);
        return result;

    }

    public List<BankAccount> listBankAccountsByNameThanAccountNumber() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        Collator collator = Collator.getInstance(new Locale("hu","HU"));
        Collections.sort(result,Comparator.comparing((x) -> x.getNameOfOwner(),Comparator.nullsFirst(collator)));

        return result;

    }
}
