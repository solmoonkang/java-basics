package section10.error_handling.chapter05.try_resources;

public class OpFailException extends Exception {

    public OpFailException() {
        super("💀 작전 실패");
    }
}
