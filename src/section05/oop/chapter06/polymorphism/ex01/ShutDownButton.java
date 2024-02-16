package section05.oop.chapter06.polymorphism.ex01;

public class ShutDownButton extends Button {

    public ShutDownButton () {
        super("ShutDown"); // 💡 부모의 생성자 호출 -> 부모 클래스인 Button의 생성자를 호출해서 자기 자신을 생성한다.
    }

    //  💡 부모의 메소드를 override
    @Override
    public void func () {
        System.out.println("프로그램 종료");
    }
}
