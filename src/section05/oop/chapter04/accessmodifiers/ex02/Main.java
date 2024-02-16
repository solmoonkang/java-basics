package section05.oop.chapter04.accessmodifiers.ex02;

import section05.oop.chapter04.accessmodifiers.ex01.SmartPhone;

public class Main {
    public static void main(String[] args) {
        //  ⭐️ 다른 패키지에서 사용하면 상단에 임포트되어야 함 (IDE 안내)
        SmartPhone smartPhone = new SmartPhone();

        // String pb = smartPhone.powerButton; // ⚠️ 불가     -> SmartPhone 클래스에서 default로 선언했기 때문에 사용할 수 없다.
        String ss = smartPhone.sdCardSlot;
    }
}
