package section04.controlstate_methods.chapter03.forloop;

public class Ex04 {
    public static void main(String[] args) {

        //  구구단 예제
        for (int i = 1; i < 10; i++) {      // i가 1일 때,
            for (int j = 1; j < 10; j++) {  // j는 9번을 반복하게 된다.
                System.out.printf("%d X %d = %2d%n", i, j, i * j);  // 따라서 i가 9번 j가 9번 반복하여 총 81번이 출력된다.
            }
        }

        String[][] quotesInLangs = {
                {
                        "I am vengeance.",
                        "I am night.",
                        "I am Batman.",
                },
                {
                        "나는 복수를 하지.",
                        "나는 밤이지.",
                        "나는 배트맨이지.",
                },
        };

        String result = "";
        for (String[] quotes : quotesInLangs) {
            for (String quote : quotes) {
                result += quote + " "; // 🔴
            }
            result = result.trim().concat("\n");
        }

        System.out.println(result);
    }
}
