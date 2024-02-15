package section04.controlstate_methods.chapter04.whileloop;

public class Ex04 {
    public static void main(String[] args) {

        // final int LINE_WIDTH = 5;

        // int lineWidth = LINE_WIDTH;

        // 위 코드를 리팩토링할 경우 다음과 같이 선언해서 사용할 수 있다.
        int lineWidth = 5;

        while (lineWidth > 0) {
            int starsToPrint = lineWidth--;
            while (starsToPrint-- > 0) {
                System.out.print("*");
            }
            System.out.println();
        }

        //  for 문으로 다시 작성
        for (int i = lineWidth; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
