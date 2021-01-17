package exceptionclass.bank2;

public class LowBalanceBankOperationException extends InvalidBankOperationException2{

    public LowBalanceBankOperationException(String message) {
        super(message);
    }
}
