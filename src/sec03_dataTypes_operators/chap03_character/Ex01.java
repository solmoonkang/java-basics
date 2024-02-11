package sec03_dataTypes_operators.chap03_character;

public class Ex01 {
    public static void main(String[] args) {

        //  각 문자는 상응하는 정수를 가짐
        char ch1 = 'A';             // ch1: 'A' 65
        char ch2 = 'B';             // ch2: 'B' 66
        char ch3 = 'a';             // ch3: 'a' 97
        char ch4 = 'a' + 1;         // ch4: 'b' 98
        char ch5 = '가';             // ch5: '가' 44032
        char ch6 = '가' + 1;         // ch6: '각' 44033
        char ch7 = '가' + 2;         // ch7: '갂' 44034
        char ch8 = '가' + 3;         // ch8: '갃' 44035
        char ch9 = '나';             // ch9: '나' 45208

        int ch1Int = (int) ch1;     // ch1: 'A' 65          ch1Int: 65
        int ch9Int = (int) ch9;     // ch9: '나' 45208       ch9Int: 45208

        // 문자 리터럴과 숫자, 유니코드로 표현 가능
        char ch10 = 'A';
        char ch11 = 65;
        char ch12 = '\u0041';
    }
}
