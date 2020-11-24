package algorithmsdecision;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime startTime, LocalDateTime endTime, int i) {
        for (Transaction item : transactions) {
            if (item.isDebit()&&
                    item.getDateOfTransaction().isAfter(startTime) &&
                    item.getDateOfTransaction().isBefore(endTime) &&
                    item.getAmount()>i){
                return true;
            }
        }
        return false;
    }
}
