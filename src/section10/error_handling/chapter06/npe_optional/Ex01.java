package section10.error_handling.chapter06.npe_optional;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {

        String nulStr = null;
        System.out.println(nulStr.length()); // ⚠️ NPE


        System.out.println(
                catOrNull().length()  // 반복실행해 볼 것
        );


        //  try-catch 문으로 NPE에 대비하기
        //  반복실행해 볼 것
        try {
            System.out.println(
                    catOrNull().length()
            );
        } catch (NullPointerException ne) {
            ne.printStackTrace();
            System.out.println(0);
        }
    }

    public static String catOrNull () {
        //  슈뢰딩거의 고양이
        return new Random().nextBoolean() ? "Cat" : null;
    }
}
