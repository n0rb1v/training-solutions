package staticattrmeth;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankTransaction {
    private static final long MIN_TRX_VAL = 1;
    private static final long MAX_TRX_VAL = 10_000_000;
    private static long currentMinValue;
    private static long currentMaxValue;
    private static BigDecimal sumOfTrxs;
    private static long countTrx;
    private long trxValue;

    public static void initTheDay() {
        currentMinValue = MAX_TRX_VAL;
        currentMaxValue = MIN_TRX_VAL;
        sumOfTrxs = new BigDecimal(0);
        countTrx = 0;
    }

    public BankTransaction(long trx) {
        if (trx < MIN_TRX_VAL || trx > MAX_TRX_VAL) {
            throw new IllegalArgumentException("trx error: " + trx);
        }
        countTrx++;
        sumOfTrxs = sumOfTrxs.add(new BigDecimal(Long.toString(trx)));
        if (trx < currentMinValue) {
            currentMinValue = trx;
        }
        if (trx > currentMaxValue) {
            currentMaxValue = trx;
        }
        this.trxValue = trx;
    }

    public static long getCurrentMinValue() {
        return countTrx == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return countTrx == 0 ? 0 : currentMaxValue;
    }

    public long getTrxValue() {
        return trxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return sumOfTrxs;
    }

    public static BigDecimal averageOfTransaction() {
        return countTrx == 0 ? new BigDecimal(0) : sumOfTrxs.divide(new BigDecimal(Long.toString(countTrx)), 0, RoundingMode.HALF_UP);
    }

}
