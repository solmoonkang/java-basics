package section10.error_handling.chapter04.passing_rethrowing;

public class SmallException extends Exception {

    public SmallException() {
        super("사원급 문제");
    }
}
