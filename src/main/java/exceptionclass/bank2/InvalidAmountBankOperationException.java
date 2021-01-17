package exceptionclass.bank2;

public class InvalidAmountBankOperationException extends InvalidBankOperationException2{

    public InvalidAmountBankOperationException(String message) {
        super(message);
    }
}
