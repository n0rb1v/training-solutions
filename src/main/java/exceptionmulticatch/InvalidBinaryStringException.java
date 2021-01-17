package exceptionmulticatch;

public class InvalidBinaryStringException extends RuntimeException {

    public InvalidBinaryStringException(Throwable cause) {
        super(cause);
    }

    public InvalidBinaryStringException(String message) {
        super(message);
    }
}
