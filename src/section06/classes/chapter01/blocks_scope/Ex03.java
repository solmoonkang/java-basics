package section06.classes.chapter01.blocks_scope;

public class Ex03 {
    public static void main(String[] args) {

        String str = "바깥쪽";
        {
            // String str = "안쪽"; // ⚠️ 불가
        }

        while (true) {
            // String str = "안쪽"; // ⚠️ 불가
        }
    }
}
