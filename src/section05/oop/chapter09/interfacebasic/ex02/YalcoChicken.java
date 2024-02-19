package section05.oop.chapter09.interfacebasic.ex02;

public class YalcoChicken implements FoodSafety {

    @Override
    public void cleanKitchen() {
        System.out.println("매일 주방 청소");
    }

    @Override
    public void employeeEducation() {
        System.out.println("직원 위생 교육");
    }
}
