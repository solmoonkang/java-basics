package section05.oop.chapter04.accessmodifiers.ex01;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
        // String cu = phone.cpu; // ⚠️ 불가      -> SmartPhone 클래스에서 private으로 선언했기 때문에 사용할 수 없다.
    }
}
