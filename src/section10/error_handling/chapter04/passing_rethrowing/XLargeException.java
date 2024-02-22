package section10.error_handling.chapter04.passing_rethrowing;

public class XLargeException extends Exception {

    public XLargeException() {
        super("사장급 문제");
    }
}
