package sec03.chap01;

public class Ex09 {
    public static void main(String[] args) {

        //  값을 바꿔가면서 실행해 볼 것
        int int1 = 3;
        int int2 = 3;

        //  다른 정수 자료형끼리 사용 가능
        boolean bool1 = int1 == int2;   // bool1: true
        boolean bool2 = int1 != int2;   // bool2: false

        boolean bool3 = int1 > int2;    // bool3: false
        boolean bool4 = int1 >= int2;   // bool4: true

        boolean bool5 = int1 < int2;    // bool5: false
        boolean bool6 = int1 <= int2;   // bool6: true

        //  💡 우선순위에 따른 연산
        boolean bool7 = int1 * int2 > int1 + int2;  // int1: 3  int2: 3  bool7: true
    }
}
