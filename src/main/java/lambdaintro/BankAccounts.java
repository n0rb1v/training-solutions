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
                return Math.abs((int) o1.getBalance()) - Math.abs((int) o2.getBalance());
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
        Collator c = Collator.getInstance(new Locale("hu", "HU"));
//        Collections.sort(result, new Comparator<BankAccount>() {
//            @Override
//            public int compare(BankAccount o1, BankAccount o2) {
//                if (o1.getNameOfOwner() == null) {
//                    return -1;
//                }
//                if (o2.getNameOfOwner() == null) {
//                    return 1;
//                }
//                if (!o1.getNameOfOwner().equals(o2.getNameOfOwner())) {
//                    return o1.getNameOfOwner().compareTo(o2.getNameOfOwner());
//                }else {
//                    return o1.getAccountNumber().compareTo(o2.getAccountNumber());
//                }
//            }
//        });
//        Collections.sort(result, Comparator.nullsFirst(((Comparator<BankAccount>) (o1, o2) -> {
//            return o1.getNameOfOwner().compareTo(o2.getNameOfOwner());
//        }).thenComparing(new Comparator<BankAccount>() {
//            @Override
//            public int compare(BankAccount o1, BankAccount o2) {
//                return o1.getAccountNumber().compareTo(o2.getAccountNumber());
//            }
//        })));
//        return result;

        List<BankAccount> ordered = new ArrayList<>(bankAccounts);
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
        ordered.sort(
                Comparator.comparing(BankAccount::getNameOfOwner,
                        Comparator.nullsFirst(collator))
                        .thenComparing(BankAccount::getAccountNumber));
        return ordered;
    }
}

