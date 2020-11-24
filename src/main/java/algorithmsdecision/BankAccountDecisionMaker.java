package algorithmsdecision;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> acclist, int num){
        boolean b = false;
        for (BankAccount item: acclist){
            if (item.getBalance()>num){
                b=true;
            }
        }
        return b;
    }
}
