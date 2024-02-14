package section04.controlstate_methods.chapter03.forloop;

public class Ex03 {
    public static void main(String[] args) {
        // 변수의 사용이 줄어들수록 더 효율이 좋은 코드라고 할 수 있다.
        // 변수의 사용이 늘어나면 그만큼 개발자의 실수가 발생할 확률이 증가하고 효율이 더 떨어진다.
        // 떄문에 이러한 한계를 해결하기 위해서 함수형 프로그래밍이 등장하게 된다.

        //  4의 배수 차례로 10개 배열에 담기
        int count = 10;
        int[] multiOf4 = new int[count];

        for (int i = 1, c = 0; c < count; i++) {
            if (i % 4 == 0) {
                multiOf4[c++] = i;
            }
        }

        int[] mySelf = new int[10];
        for (int i = 0; i < mySelf.length; i++) {
            mySelf[i] = (i + 1) * 4;
        }

        //  💡 배열 순환 (기본적인 방법) -> 배열의 각 요소를 출력하는 방법 1
        for (int i = 0; i < multiOf4.length; i++) {
            System.out.println(multiOf4[i]);
        }

        System.out.println("\n- - - - -\n");

        //  💡 for each 문법 - 배열이나 이후 배울 콜랙션 등에 사용 -> 향상된 for 문이라고도 하며, 배열의 각 요소를 출력하는 방법 2
        for (int num : multiOf4) {
            System.out.println(num);
        }

        System.out.println("\n- - - - -\n");

        int sumOfArray = 0;
        for (int num : multiOf4) {
            sumOfArray += num;
        }

        System.out.println("\n- - - - -\n");

        for (String s : "호롤롤로".split("")) {
            System.out.println(s);
        }
    }
}
