package section05.oop.chapter07.finalclass;

// 마찬가지로 클래스 앞에 final 키워드를 붙이면, 해당 부모는 자식을 만들 수 없다는 의미가 된다. -> mean 정관수술
public final class YalcoChickenDT extends YalcoChicken {

    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

    //  ⚠️ 불가
    // public void fryChicken () {
    //     System.out.println("염지, 반죽입히기, 미원, 튀김");
    // }

    // 생성자 추가할 것
}
