package section09.functional_programming.chapter01.lambda_expressions;

@FunctionalInterface
public interface Printer {

    void print ();

    //  void say (); // ⚠️ 둘 이상의 메소드는 불가
}
