package algorithmscount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts,int number){
        int sum = 0;
        for (BankAccount item: bankAccounts) {
            if (item.getBalance()>number){
                sum++;
            }
        }
        return sum;

    }
}
