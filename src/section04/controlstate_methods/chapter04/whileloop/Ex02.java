package section04.controlstate_methods.chapter04.whileloop;

public class Ex02 {
    public static void main(String[] args) {

        //  100보다 작은 3의 배수들 출력해보기

        int i = 1;

        // ⚠️ 의도대로 작동하지 않음. 이유는? -> if (i % 3 != 0) continue; 해당 부분에 걸려서 계속해서 continue가 되어서 무한루프에 빠진다.
        while (true) {
            if (i % 3 != 0) continue;  // 🔴
            System.out.println(i);

            if (i++ == 100) break;
        }

        int j = 1;

        while (true) {
            if (j++ == 100) break;              // 이전 방식대로 구현할 경우 i++를 증가시키는 곳까지 도달하지 못해 i를 먼저 증가시킨다.
            if ((j - 1) % 3 != 0) continue;     // 또한, 늘어난 i의 이전 값을 통해서 3의 배수임을 확인한다.

            System.out.println(j - 1);
        }


        int k = 1;

        //  보다 가독성을 높이고 의도를 잘 드러낸 코드
        while (true) {
            int cur = k++;

            if (cur == 100) break;
            if (cur % 3 != 0) continue;

            System.out.println(cur);

        }
    }
}
