package section03.datatypes_operators.chapter06.stringmethods;

public class Ex03 {
    public static void main(String[] args) {

        String str1 = "아야 슬슬 오함마 준비해야 쓰것다";

        //  💡 charAt : ~번째 문자 반환
        char ch1 = str1.charAt(0);
        char ch2 = str1.charAt(4);

        //  ⭐️ 마지막 문자 얻기
        char ch3 = str1.charAt(str1.length() - 1);

        String str2 = "얄리 얄리 얄라셩 얄라리 얄라";

        //  💡 indexOf/lastIndexOf : 일치하는 첫/마지막 문자열의 위치
        //  앞에서부터 카운트해서 int로 반환

        //  두 번째 인자 : ~번째 이후/이전부터 셈
        int int1 = str2.indexOf('얄');
        int int2 = str2.indexOf('얄', 4);        // 즉, index=4 이후에 나오는 '얄'의 위치를 반환한다.

        int  int3 = str2.indexOf("얄라");
        int  int4 = str2.lastIndexOf("얄라");
        int  int5 = str2.lastIndexOf("얄라", 12); // indexOf와 반대로 index=12 이전에 나오는 "얄라"의 위치를 반환한다.

        //  💡 포함되지 않은 문자는 -1 반환
        int int6 = str2.indexOf('욜');
    }
}
