package exceptionclass.bank2;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException2{

    public InvalidAccountNumberBankOperationException(String message) {
        super(message);
    }
}
