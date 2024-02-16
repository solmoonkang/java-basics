package section05.oop.chapter05.inheritance.ex01;

public class YalcoChicken {

    // protected 접근 제어자는 자식 클래스의 코드에서 사용이 가능하다.
    protected int no;
    protected String name;

    public YalcoChicken (int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder () {
        System.out.printf("%d호 %s점 홀 주문 받음%n", no, name);
    }
}
