package section10.error_handling.chapter04.passing_rethrowing;

public class WrongMonthException extends Exception {

    public WrongMonthException(String message) {
        super(message);
    }

    public WrongMonthException(String message, Throwable cause) {
        super(message, cause);
    }
}
