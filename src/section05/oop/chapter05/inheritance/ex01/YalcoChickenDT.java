package section05.oop.chapter05.inheritance.ex01;

public class YalcoChickenDT extends YalcoChicken {      // YalcoChickenDT는 YalcoChicken을 상속받는다.

    private boolean driveThruOpen = true;

    public YalcoChickenDT(int no, String name) {
        super(no, name); // 다음 예제에서 다룰 것
    }

    public void setDriveThruOpen(boolean driveThruOpen) {
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder () {
        System.out.printf(
                "%d호 %s점 드라이브스루 주문 %s%n",
                no, name,
                (driveThruOpen ? "받음" : "불가")
        );
    }
}
