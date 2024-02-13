package sec03_dataTypes_operators.chap08_array;

public class Ex06 {
    public static void main(String[] args) {

        //  상수 배열의 경우 -> NUMBERS라는 집에 1 ~ 5까지의 가구들을 배치
        final int[] NUMBERS = {1, 2, 3, 4, 5};

        //  ⚠️ 다른 배열을 할당하는 것은 불가 -> But, 다른 집으로 가구들을 옮길 수는 없음
        // NUMBERS = new int[] {2, 3, 4, 5, 6};

        //  ⭐️ 배열의 요소를 바꾸는 것은 가능 -> 단, 그 집에 있는 가구들은 바꿀 수 있음
        NUMBERS[0] = 11;
    }
}
